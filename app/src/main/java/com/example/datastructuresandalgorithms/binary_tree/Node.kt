package com.example.datastructuresandalgorithms.binary_tree

class Node<T>(data: T) {
    private val data: T = data
    private var leftChild: Node<T>? = null
    private var rightChild: Node<T>? = null

    fun getData(): T {
        return data
    }

    fun setLeftChild(node: Node<T>?) {
        leftChild = node
    }

    fun getLeftChild(): Node<T>? {
        return leftChild
    }

    fun setRightChild(node: Node<T>?) {
        rightChild = node
    }

    fun getRightChild(): Node<T>? {
        return rightChild
    }
}