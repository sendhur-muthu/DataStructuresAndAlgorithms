package com.example.datastructuresandalgorithms.problems.sliding_window

import kotlin.math.max

fun main() {
    println("The longest repeating character replacement is: ${longestRepeatingCharacterReplacement(
        "ABABBA",
        2
    )}")
}

fun longestRepeatingCharacterReplacement(s: String, k: Int): Int {
    val hashMap = hashMapOf<Char, Int>()
    var left = 0
    var result = 0
    for (right in s.indices) {
        val charRight = s[right]
        hashMap[charRight] = hashMap.getOrDefault(charRight, 0) + 1

        while (((right - left + 1) - hashMap.values.maxOf { it }) > k) {
            val charLeft = s[left]
            if (hashMap.containsKey(charLeft)) {
                hashMap[charLeft] = hashMap[charLeft]!! - 1
            }
            left++
        }
        result = max(result, right - left + 1)
    }
    return result
}