package com.example.datastructuresandalgorithms.sorting

fun selectionSort(array: MutableList<Int>) {
    for (i in 0 until array.size - 1) {
        for (j in i + 1 until array.size) {
            if (array[i] > array[j]) {
                Helper.swapNumbers(array, i, j)
            }
        }
    }
}

/*Selection sort - For each element the entire list is checked to find the smallest element
* Time complexity - O(n^2)*/
