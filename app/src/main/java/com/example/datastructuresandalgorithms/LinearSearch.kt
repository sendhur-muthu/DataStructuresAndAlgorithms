package com.example.datastructuresandalgorithms

/*
    * Linear search - Iterate through a collection one element at a time
    *
    * Runtime complexity = O(n)
    *
    * Disadvantages:
    * 1. Slow for large data sets
    *
    * Advantages:
    * 1. Fast for searches of small to medium data sets.
    * 2. Does not need to be sorted.
    * 3. Useful for data structures that do not have random access.*/

fun main() {
    val array = arrayOf(2,5,3,1,5,8,6,6)
    val index = linearSearch(array, 6)
    println(index)
}

fun linearSearch(array: Array<Int>, value: Int): Int {
    for (i in array.indices) {
        if (array[i] == value) {
            return i
        }
    }
    return -1
}
