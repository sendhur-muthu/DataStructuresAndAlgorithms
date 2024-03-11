package com.example.datastructuresandalgorithms.problems

import java.util.LinkedList
import java.util.Stack

fun main() {
    val array = arrayOf(1, 4, 3, 2, 5, 2, 4)
    println(findDuplicates(array))

}

fun findDuplicates(array: Array<Int>): Any {
    val hashMap = hashMapOf<Int, Int>()
    for (num in array) {
        hashMap[num] = hashMap.getOrDefault(num, 0) + 1
    }
    return hashMap
}
