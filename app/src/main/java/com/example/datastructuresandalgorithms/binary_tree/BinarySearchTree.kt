package com.example.datastructuresandalgorithms.binary_tree

fun insert(root: Node<Int>?, node: Node<Int>): Node<Int> {
    if (root == null) {
        return node
    }
    if (node.getData() <= root.getData()) {
        root.setLeftChild(insert(root.getLeftChild(), node))
    } else {
        root.setRightChild(insert(root.getRightChild(), node))
    }
    return root
}

fun lookup(root: Node<Int>?, node: Node<Int>): Node<Int>? {
    if (root == null) {
        return null
    }
    return if (root.getData() == node.getData()) {
        root
    } else if (node.getData() <= root.getData()) {
        lookup(root.getLeftChild(), node)
    } else {
        lookup(root.getRightChild(), node)
    }
}