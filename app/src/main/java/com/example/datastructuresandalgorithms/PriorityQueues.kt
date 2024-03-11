package com.example.datastructuresandalgorithms

import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

fun main() {
    val priorityQueue: Queue<Double> = PriorityQueue(Collections.reverseOrder())
    priorityQueue.offer(2.6)
    priorityQueue.offer(1.9)
    priorityQueue.offer(2.2)
    priorityQueue.offer(3.0)
    priorityQueue.offer(4.8)

    while (!priorityQueue.isEmpty()) {
        println(priorityQueue.poll())
    }

    //As the name suggest the Priority Queue will arrange the elements in the priority order given in the constructor
}