package org.jetbrains.ring

fun classValues(size: Int): Iterable<Value> {
    return intValues(size).map { Value(it) }
}

fun stringValues(size: Int): Iterable<String> {
    return intValues(size).map { it.toString() }
}

fun intValues(size: Int): Iterable<Int> {
    return 1..size
}

open class Value(var value: Int) {
    val text = value.toString().reversed()
}

fun filterLoad(v: Value): Boolean {
    return v.value.toString() in v.text
}

fun mapLoad(v: Value): String = v.text.reversed()

fun filterLoad(v: Int): Boolean {
    return v.toString() in "0123456789"
}

fun mapLoad(v: Int): String = v.toString()

fun filterSome(v: Int): Boolean = v % 7 == 0 || v % 11 == 0

fun filterPrime(v: Int): Boolean {
    if (v <= 1)
        return false
    if (v <= 3)
        return true
    if (v % 2 == 0)
        return false
    var i = 3
    while (i*i <= v) {
        if (v % i == 0)
            return false
        i += 2
    }
    return true
}

inline fun Array<Value>.cnt(predicate: (Value) -> Boolean): Int {
    var count = 0
    for (element in this) {
        if (predicate(element))
            count++
    }
    return count
}

inline fun IntArray.cnt(predicate: (Int) -> Boolean): Int {
    var count = 0
    for (element in this) {
        if (predicate(element))
            count++
    }
    return count
}

inline fun Iterable<Int>.cnt(predicate: (Int) -> Boolean): Int {
    var count = 0
    for (element in this) {
        if (predicate(element))
            count++
    }
    return count
}

inline fun Sequence<Int>.cnt(predicate: (Int) -> Boolean): Int {
    var count = 0
    for (element in this) {
        if (predicate(element))
            count++
    }
    return count
}

