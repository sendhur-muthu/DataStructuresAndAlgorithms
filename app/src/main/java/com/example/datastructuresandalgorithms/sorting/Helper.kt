package com.example.datastructuresandalgorithms.sorting

object Helper {
    fun swapNumbers(list: MutableList<Int>, iIndex: Int, jIndex: Int) {
        val temp = list[iIndex]
        list[iIndex] = list[jIndex]
        list[jIndex] = temp
    }
}