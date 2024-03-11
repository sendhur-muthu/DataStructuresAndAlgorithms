package com.example.datastructuresandalgorithms.queue

/* Queue implementation using Circular Array
* enqueue, dequeue, isEmpty, isFull - O(1)
* */

class Queue<T> {
    private val specialEmptyValue = -1
    private val maxSize = 40
    private val elements: ArrayList<T> = ArrayList(maxSize)

    private var headIndex = specialEmptyValue
    private var tailIndex = specialEmptyValue

    fun enqueue(data: T) {
        if (isFull()) {
            throw QueueOverflowException()
        }
        tailIndex = (tailIndex + 1) % elements.size  //Note that we need to wrap around to the beginning position if we're at the end of the circular array.
        elements[tailIndex] = data      //Get the next tail index and insert the element
        if (headIndex == specialEmptyValue) {   //Only executes if it is the first element enqueued.
            headIndex = tailIndex
        }
    }

    fun dequeue() : T {
        if (isEmpty()) {
            throw QueueUnderflowException()
        }
        val data = elements[headIndex]
        headIndex = if (headIndex == tailIndex) {   //If head equals to tails, we just dequeued the last element, so mark the head accordingly.
            specialEmptyValue
        } else {
            (headIndex + 1) % elements.size   //Move the head to next element - Remember to wrap around to the beginning of the array for the last element dequeued.
        }
        return data
    }

    fun isEmpty(): Boolean = headIndex == specialEmptyValue

    fun isFull(): Boolean {     //When the queue is full, the head and tail are right next to one another
        val nextIndex = (tailIndex + 1) % elements.size
        return nextIndex == headIndex       //Check whether the next position of the tail is the head
    }
}

class QueueOverflowException : Exception()
class QueueUnderflowException : Exception()