package com.example.datastructuresandalgorithms.binary_tree

import com.example.datastructuresandalgorithms.queue.Queue


fun breadthFirstTraversal(root: Node<Char>?) {
    if (root == null) {
        return
    }
    val queue = Queue<Node<Char>>()
    queue.enqueue(root)
    while (!queue.isEmpty()) {
        val node = queue.dequeue()
        node.getLeftChild()?.let {
            queue.enqueue(it)
        }
        node.getRightChild()?.let {
            queue.enqueue(it)
        }
    }
}