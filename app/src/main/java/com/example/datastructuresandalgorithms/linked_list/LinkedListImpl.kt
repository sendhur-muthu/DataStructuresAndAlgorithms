package com.example.datastructuresandalgorithms.linked_list

class LinkedListImpl<T> {
    private var head: Node<T>? = null

    fun length(): Int {
        var count = 0
        var currentNode = head
        while (currentNode != null) {
            currentNode = currentNode.getNext()
            count++
        }
        return count
    }

    fun add(data: T) {
        if (head == null) {
            head = Node(data)
            return
        }
        var currentNode = head
        while (currentNode?.getNext() != null) {
            currentNode = currentNode.getNext()
        }
        currentNode?.setNext(Node(data))
    }

    fun pop(): T? {
        return head?.let {
            val topElement = it.getData()
            head = it.getNext()
            topElement
        }
    }
}