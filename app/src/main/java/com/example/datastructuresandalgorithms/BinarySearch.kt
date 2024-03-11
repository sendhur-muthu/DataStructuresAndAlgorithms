package com.example.datastructuresandalgorithms

import java.util.Arrays

/*
    * Binary search - An algorithm to find the position of a target value in a sorted array.
    * Half of the array will be eliminated in each iteration.
    * This works by splitting a array into two and checks whether the desired value is less than or greater than. And ignores the other half and repeats the step.
    *
    * Runtime complexity = O(log n)
    *
    * Disadvantages:
    * 1. Slow for smaller data sets
    * 2. Needs the values to be sorted.
    *
    * Advantages:
    * 1. Fast for searches of medium to large data sets.
    */

fun main() {
    val array = IntArray(100)
    val valueToBeFound = 99
    for (i in 0 until 100) {
        array[i] = i
    }
    //val index = Arrays.binarySearch(array, valueToBeFound)
    val index = binarySearch(array, valueToBeFound)
    if (index == -1) {
        println("$valueToBeFound is not found")
    } else {
        println("$valueToBeFound is at index $index")
    }
    
}

fun binarySearch(array: IntArray, valueToBeFound: Int): Any {
    var lowIndex = 0
    var highIndex = array.size - 1
    while (lowIndex <= highIndex) {
        val middleIndex = lowIndex + (highIndex - lowIndex) / 2
        val value = array[middleIndex]
        println(value)
        if (value < valueToBeFound) {
            lowIndex = middleIndex + 1
        } else if (value > valueToBeFound) {
            highIndex = middleIndex - 1
        } else {
            return middleIndex
        }
    }
    return -1
}
