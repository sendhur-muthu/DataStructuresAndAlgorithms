package com.example.datastructuresandalgorithms.problems.sliding_window

fun main() {
    println("The anagrams start indices are: ${allAnagramsInString(
        s = "cbaebabacd",
        p = "abc"
    )}")
}

fun allAnagramsInString(s: String, p: String): List<Int> {
    val indicesList = mutableListOf<Int>()
    val pMap = hashMapOf<Char, Int>()
    p.forEach {
        pMap[it] = pMap.getOrDefault(it, 0) + 1
    }
    var left = 0
    var count = p.length
    for (right in s.indices) {
        val charRight = s[right]
        if (pMap.containsKey(charRight)) {
            pMap[charRight] = pMap[charRight]!! - 1
            count--
            if (pMap.all { it.value == 0 }) indicesList.add(left)
        }

        if (right >= p.length - 1) {
            val charLeft = s[left]
            if (pMap.containsKey(charLeft)) {
                pMap[charLeft] = pMap[charLeft]!! + 1
                count++
                if (pMap.all { it.value == 0 }) indicesList.add(left)
            }
            left++
        }
    }
    return indicesList
}