package com.example.datastructuresandalgorithms.problems.sliding_window

fun main() {

    val s = "ADOBECODBANC"
    val t = "ABC"
    println("Minimum window substring is: ${minimumWindowSubstring(s, t)}")
}

fun minimumWindowSubstring(s: String, t: String): String {
    val tMap = HashMap<Char, Int>()
    for (c in t) {
        tMap[c] = tMap.getOrDefault(c, 0) + 1
    }
    var i = 0
    var j = 0
    var count = t.length
    // minStart and minLen are to return the minimum window finally
    var minStart = 0
    var minLen = Int.MAX_VALUE
    while (j < s.length) {
        val charJ = s[j]
        if (tMap.containsKey(charJ)) {
            if (tMap[charJ]!! > 0) count--
            tMap[charJ] = tMap[charJ]!! - 1
        }

        while (count == 0) {
            if (j - i + 1 < minLen) {
                minStart = i
                minLen = j - i + 1
            }
            val charI = s[i]
            if (tMap.containsKey(charI)) {
                tMap[charI] = tMap[charI]!! + 1
                if (tMap[charI]!! > 0) count++
            }
            i++
        }

        j++
    }
    return if (minLen != Int.MAX_VALUE) s.substring(minStart until minStart + minLen) else ""
}