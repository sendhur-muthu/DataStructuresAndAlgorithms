package com.example.datastructuresandalgorithms.sorting

fun bubbleSort(array: MutableList<Int>) {
    for (i in 0 until array.size) {
        var isSwapped = false
        for (j in array.size - 1 downTo i + 1) {
            if (array[j] < array[j - 1]) {
                Helper.swapNumbers(array, j, j - 1)
                isSwapped = true
            }
        }
        println(array)
        if (!isSwapped) {
            break
        }
    }
}