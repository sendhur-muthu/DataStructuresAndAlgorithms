package com.example.datastructuresandalgorithms.binary_tree.problems

import com.example.datastructuresandalgorithms.binary_tree.Node
import kotlin.math.max

fun maxDepthOfBinaryTree(node: Node<Char>?): Int {
    if (node == null) {
        return 0
    }
    if (node.getLeftChild() == null && node.getRightChild() == null) {
        return 0
    }
    val leftDepth = 1 + maxDepthOfBinaryTree(node.getLeftChild())
    val rightDepth = 1 + maxDepthOfBinaryTree(node.getRightChild())
    return max(leftDepth, rightDepth)
}