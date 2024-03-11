package com.example.datastructuresandalgorithms.sorting

fun main() {
    val array = intArrayOf(4, 5, 6, 2, 1, 7, 10, 3, 8, 9).toMutableList()
    println("OG: $array")
    //selectionSort(array)
    bubbleSort(array)
    println("Sorted: $array")
}