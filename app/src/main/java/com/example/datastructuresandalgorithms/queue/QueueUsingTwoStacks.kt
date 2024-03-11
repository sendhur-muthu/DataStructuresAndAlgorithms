package com.example.datastructuresandalgorithms.queue

import com.example.datastructuresandalgorithms.stack.Stack

class QueueUsingTwoStacks<T> {
    private val forwardStack = Stack<T>()
    private val reverseStack = Stack<T>()

    fun enqueue(data: T) {
        if (isFull()) {
            throw QueueOverflowException()
        }
        try {
            if (forwardStack.isEmpty()) {
                while (!reverseStack.isEmpty()) {
                    forwardStack.push(reverseStack.pop()!!)
                }
            }
            forwardStack.push(data)
        } catch (exception: Exception) {
            throw QueueOverflowException()
        }
    }

    fun dequeue() {
        if (isEmpty()) {
            throw QueueUnderflowException()
        }
        try {
            if (reverseStack.isEmpty()) {
                while (!forwardStack.isEmpty()) {
                    reverseStack.push(forwardStack.pop()!!)
                }
            }
            reverseStack.pop()
        } catch (exception: Exception) {
            throw QueueUnderflowException()
        }
    }

    fun isFull() = forwardStack.isFull() || reverseStack.isFull()

    fun isEmpty() = forwardStack.isEmpty() && reverseStack.isEmpty()
}

class QueueOverFlowException : Exception()
class QueueUnderFlowException : Exception()