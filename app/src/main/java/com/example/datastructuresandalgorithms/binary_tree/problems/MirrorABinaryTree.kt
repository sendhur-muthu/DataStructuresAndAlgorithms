package com.example.datastructuresandalgorithms.binary_tree.problems

import com.example.datastructuresandalgorithms.binary_tree.Node

fun mirrorABinaryTree(node: Node<Char>?) {
    if (node == null) {
        return
    }
    mirrorABinaryTree(node.getLeftChild())
    mirrorABinaryTree(node.getRightChild())

    val temp = node.getLeftChild()
    node.setRightChild(temp)
    node.setLeftChild(node.getRightChild())

    val deque = ArrayDeque<Int>()
    deque.last()
}