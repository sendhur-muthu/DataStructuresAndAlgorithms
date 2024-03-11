package com.example.datastructuresandalgorithms.binary_tree.problems

import com.example.datastructuresandalgorithms.binary_tree.Node

fun minimumValueOfBinarySearchTree(root: Node<Int>?): Int {
    if (root == null) {
        return Int.MIN_VALUE
    }
    if (root.getLeftChild() == null) {
        return root.getData()
    }
    return minimumValueOfBinarySearchTree(root.getLeftChild())
}