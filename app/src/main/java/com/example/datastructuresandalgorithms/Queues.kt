package com.example.datastructuresandalgorithms

import java.util.LinkedList
import java.util.Queue

fun  main() {

    // Since Queue is a interface, it cannot be instantiated. LinkedList implements Deque which extends a Queue
    val queue: Queue<String> = LinkedList<String>()

    queue.offer("Iron man") // offer() is same as add()
    //queue.poll() // poll() is same as remove(). Using poll is suggested as it doesn't causes exceptions
    println(queue.peek()) //peek() is same as element(). Using peek is suggested as it doesn't causes exceptions
}

/*
* Queue is a FIFO data structure. Head will be the first element and tail will be the last element.
*Uses of Queue
* 1. Keyboard Buffer (letter should appear on the screen in the order they're pressed.)
* 2. Printer queue (Printer should be completed in order)
* 3. Used in LinkedList, PriorityQueues, Breadth-first search
* */