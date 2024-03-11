package com.example.datastructuresandalgorithms.problems.sliding_window

import kotlin.math.max

/*
* Return the length of the Longest substring with k distinct elements
* Input arr = [I, B, H, A, A, A, H, H] k = 2
* */

fun main() {
    println("Longest length of the substring is: ${longestSubstringLength(charArrayOf('I', 'B', 'H', 'A', 'A', 'A', 'H', 'H'), 2)}")
}

fun longestSubstringLength(array: CharArray, k: Int): Int {
    var maxLength = 0
    val hashMap = HashMap<Char, Int>()
    var start = 0
    for (end in array.indices) {
        val char = array[end]
        hashMap[char] = hashMap.getOrDefault(char, 0) + 1

        while (hashMap.size > k) {
            val charStart = array[start]
            if (hashMap.containsKey(charStart)) {
                hashMap[charStart] = hashMap[charStart]!! - 1
                if (hashMap[charStart]!! <= 0) hashMap.remove(charStart)
            }
            start++
        }
        maxLength = max(maxLength, end - start + 1)
    }
    return maxLength
}