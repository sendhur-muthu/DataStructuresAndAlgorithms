package com.example.datastructuresandalgorithms.problems

fun main() {
    val array = listOf(5,2,2,6,9,7,5,9,2,1,4)
    println(removeDuplicates(array))
}

fun removeDuplicates(array: List<Int>): MutableList<Int> {
    val newArray = mutableListOf<Int>()
    var largest = -1
    array.forEach {
        if (!newArray.contains(it)) {
            newArray.add(it)
        }
        if (it > largest) {
            largest = it
        }
    }
    println("The largest is: $largest")
    return newArray
}