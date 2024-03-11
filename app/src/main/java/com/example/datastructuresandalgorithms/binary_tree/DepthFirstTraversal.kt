package com.example.datastructuresandalgorithms.binary_tree

fun preOrderTraversal(root: Node<Char>?) {
    if (root == null) {
        return
    }
    processNode(root)
    preOrderTraversal(root.getLeftChild())
    preOrderTraversal(root.getRightChild())
}

fun processNode(node: Node<Char>) {
    print("${node.getData()} ->")
}

fun inOrderTraversal(root: Node<Char>?) {
    if (root == null) {
        return
    }
    inOrderTraversal(root.getLeftChild())
    processNode(root)
    inOrderTraversal(root.getRightChild())
}

fun postOrderTraversal(root: Node<Char>?) {
    if (root == null) {
        return
    }
    postOrderTraversal(root.getLeftChild())
    postOrderTraversal(root.getRightChild())
    processNode(root)
}