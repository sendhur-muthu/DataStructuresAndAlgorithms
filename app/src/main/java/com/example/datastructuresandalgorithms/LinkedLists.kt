package com.example.datastructuresandalgorithms

import java.util.LinkedList

fun main() {
    val linkedList: LinkedList<String> = LinkedList()
    /* Linked List as a stack
    linkedList.push("A")
    linkedList.push("B")
    linkedList.push("C")
    linkedList.pop()*/

    //Linked list as a queue
    linkedList.offer("A")
    linkedList.offer("B")
    linkedList.offer("C")
    //linkedList.poll()

    linkedList.add(3, "D")
    linkedList.remove("D")
    println(linkedList.peekFirst())
    println(linkedList.peekLast())
    linkedList.offerFirst("0")
    linkedList.offerLast("1")
    linkedList.pollFirst()
    linkedList.pollLast()
    println(linkedList)

    /*
    * LinkedList - Stores nodes in 2 parts (data + address)
    * Nodes are in non-consecutive memory locations
    * Elements are linked using pointers(address to next element)
    *
    *
    *   Singly linked list (Each element contains address of next node)
    *        Node               Node                Node
    *   [data | address] -> [data | address] -> [data | address]
    *
    *
    *   Doubly linked list(Each element contains address of next node & previous node. Can be traversed from Head to tail / Tail to head)
    *             Node                            Node
    *   [address | data | address] <--> [address | data | address]
    *
    * Advantages:
    * 1. Dynamic data structure (Allocates memory while running)
    * 2. Insertion and Deletion of nodes is easy O(1)
    * 3. No/Low memory waste
    *
    * Disadvantages:
    * 1. Greater memory usage as each node as to store address.
    * 2. No random access of elements as in arrays(Using element[index]).
    * 3. Accessing and searching elements is more time consuming. O(n).
    *
    * Uses:
    * 1. Implement Stacks/Queues.
    * 2. GPS navigation (If we have to take a detour we easily insert/delete a node and recalculate distance)
    * 3. Music playlist (Each music may not be in a continuous memory)*/
}