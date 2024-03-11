package com.example.datastructuresandalgorithms.stack

import com.example.datastructuresandalgorithms.linked_list.Node

/*
* Stack using LinkedList implementation
* Time complexity for this implementation:
*  push(), pop(), isEmpty(), isFull(), size() -- O(1)
*  Where can be used:
*  1. Undo within an application
*  2. Back button - Backstack
*  3.
*  */
class Stack<T> {
    private val maxSize = 40
    private var top: Node<T>? = null
    private var size = 0

    fun push(data: T) {
        if (size == maxSize) {
            throw StackOverFlowException()
        }
        val node = Node(data)
        node.setNext(top)
        top = node
        size++
    }

    fun pop(): T? {
        if (size == 0) {
            throw StackUnderFlowException()
        }
        val data = top?.getData()
        top = top?.getNext()
        size--
        return data
    }

    fun peek(): T? {
        if (size == 0) {
            throw StackUnderFlowException()
        }
        return top?.getData()
    }

    fun size() = size
    fun isEmpty() = size == 0
    fun isFull() = size == maxSize
}

class StackOverFlowException : Exception()
class StackUnderFlowException : Exception()
