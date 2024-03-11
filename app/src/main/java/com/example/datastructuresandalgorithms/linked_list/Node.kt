package com.example.datastructuresandalgorithms.linked_list

class Node<T>(data: T) {
    private var data: T = data
    private var next: Node<T>? = null

    init {
        setNext(null)
    }

    fun getData(): T {
        return data
    }

    fun getNext(): Node<T>? {
        return next
    }

    fun setNext(node: Node<T>?) {
        next = node
    }

    override fun toString(): String {
        return data.toString()
    }
}
