/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.frontend.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-frontend-fir/testData/analysisSession/resolveCall")
@TestDataPath("$PROJECT_ROOT")
public class ResolveCallTestGenerated extends AbstractResolveCallTest {
    @Test
    public void testAllFilesPresentInResolveCall() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-frontend-fir/testData/analysisSession/resolveCall"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("delegatedConstructorCall_super.kt")
    public void testDelegatedConstructorCall_super() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/delegatedConstructorCall_super.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_super_unresolved.kt")
    public void testDelegatedConstructorCall_super_unresolved() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/delegatedConstructorCall_super_unresolved.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_this.kt")
    public void testDelegatedConstructorCall_this() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/delegatedConstructorCall_this.kt");
    }

    @Test
    @TestMetadata("delegatedConstructorCall_this_unresolved.kt")
    public void testDelegatedConstructorCall_this_unresolved() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/delegatedConstructorCall_this_unresolved.kt");
    }

    @Test
    @TestMetadata("functionCallInTheSameFile.kt")
    public void testFunctionCallInTheSameFile() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/functionCallInTheSameFile.kt");
    }

    @Test
    @TestMetadata("functionWithReceiverCall.kt")
    public void testFunctionWithReceiverCall() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/functionWithReceiverCall.kt");
    }

    @Test
    @TestMetadata("functionWithReceiverSafeCall.kt")
    public void testFunctionWithReceiverSafeCall() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/functionWithReceiverSafeCall.kt");
    }

    @Test
    @TestMetadata("implicitConstuctorCall.kt")
    public void testImplicitConstuctorCall() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/implicitConstuctorCall.kt");
    }

    @Test
    @TestMetadata("implicitJavaConstuctorCall.kt")
    public void testImplicitJavaConstuctorCall() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/implicitJavaConstuctorCall.kt");
    }

    @Test
    @TestMetadata("javaFunctionCall.kt")
    public void testJavaFunctionCall() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/javaFunctionCall.kt");
    }

    @Test
    @TestMetadata("resolveCallInSuperConstructorParam.kt")
    public void testResolveCallInSuperConstructorParam() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/resolveCallInSuperConstructorParam.kt");
    }

    @Test
    @TestMetadata("simpleCallWithNonMatchingArgs.kt")
    public void testSimpleCallWithNonMatchingArgs() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/simpleCallWithNonMatchingArgs.kt");
    }

    @Test
    @TestMetadata("unresolvedSuperReference.kt")
    public void testUnresolvedSuperReference() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/unresolvedSuperReference.kt");
    }

    @Test
    @TestMetadata("variableAsFunction.kt")
    public void testVariableAsFunction() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/variableAsFunction.kt");
    }

    @Test
    @TestMetadata("variableAsFunctionLikeCall.kt")
    public void testVariableAsFunctionLikeCall() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/variableAsFunctionLikeCall.kt");
    }
}
