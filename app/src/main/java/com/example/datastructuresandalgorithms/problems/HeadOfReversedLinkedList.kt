package com.example.datastructuresandalgorithms.problems

import java.util.LinkedList
import java.util.Stack
import kotlin.math.absoluteValue

fun main() {
    val linkedList = LinkedList<Int>()
    linkedList.add(2)
    linkedList.add(1)
    linkedList.add(3)
    linkedList.add(5)
    linkedList.add(2)
    linkedList.add(1)
    linkedList.add(4)
    println(linkedList)
    val stack = Stack<Int>()
    for (element in linkedList) {
        stack.push(element)
    }
    println("Head of the reversed list is ${stack.peek()}")
}