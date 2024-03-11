package com.example.datastructuresandalgorithms.problems.two_pointers

fun main() {
    println("The indices of the target sum in the array is ${twoSum(intArrayOf(2, 7, 8, 9, 11), 9)}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val sum = nums[start] + nums[end]
        if (sum == target) {
            return intArrayOf(start + 1, end + 1)
        } else if (sum < target) {
            start++
        } else {
            end--
        }
    }
    return intArrayOf(-1, -1)
}