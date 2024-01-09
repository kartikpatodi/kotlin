/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.compiler.based

import org.jetbrains.kotlin.analysis.low.level.api.fir.api.DiagnosticCheckerFilter
import org.jetbrains.kotlin.analysis.low.level.api.fir.api.LLFirResolveSession
import org.jetbrains.kotlin.analysis.low.level.api.fir.api.collectDiagnosticsForFile
import org.jetbrains.kotlin.diagnostics.KtDiagnostic
import org.jetbrains.kotlin.fir.AbstractFirAnalyzerFacade
import org.jetbrains.kotlin.fir.analysis.checkers.MppCheckerKind
import org.jetbrains.kotlin.fir.declarations.FirFile
import org.jetbrains.kotlin.fir.pipeline.FirResult
import org.jetbrains.kotlin.fir.pipeline.ModuleCompilerAnalyzedOutput
import org.jetbrains.kotlin.fir.psi
import org.jetbrains.kotlin.fir.resolve.ScopeSession
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.test.model.TestFile

open class LowLevelFirAnalyzerFacade(
    val firResolveSession: LLFirResolveSession,
    val allFirFiles: Map<TestFile, FirFile>,
    private val diagnosticCheckerFilter: DiagnosticCheckerFilter,
) : AbstractFirAnalyzerFacade() {
    override val scopeSession: ScopeSession
        get() = ScopeSession()

    override val result: FirResult
        get() {
            val output = ModuleCompilerAnalyzedOutput(firResolveSession.useSiteFirSession, scopeSession, allFirFiles.values.toList())
            return FirResult(listOf(output))
        }

    private var resolved: Boolean = false

    // TODO: investigate
    fun runCheckers(): Map<FirFile, List<KtDiagnostic>> {
        if (!resolved) {
            runResolution()
            resolved = true
        }

        return allFirFiles.values.associateWith { firFile ->
            val ktFile = firFile.psi as KtFile
            val diagnostics = ktFile.collectDiagnosticsForFile(firResolveSession, diagnosticCheckerFilter)
            @Suppress("UNCHECKED_CAST")
            diagnostics.toList() as List<KtDiagnostic>
        }
    }

    override fun runResolution(): List<FirFile> = allFirFiles.values.toList()
}
