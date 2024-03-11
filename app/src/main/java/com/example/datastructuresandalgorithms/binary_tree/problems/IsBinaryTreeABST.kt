package com.example.datastructuresandalgorithms.binary_tree.problems

import com.example.datastructuresandalgorithms.binary_tree.Node

fun isBinarySearchTree(node: Node<Int>?, min: Int, max: Int): Boolean {
    if (node == null) {
        return true
    }
    if (node.getData() !in min..max) {
        return false
    }
    return isBinarySearchTree(node.getLeftChild(), min, node.getData())
            && isBinarySearchTree(node.getRightChild(), node.getData(), max)
}