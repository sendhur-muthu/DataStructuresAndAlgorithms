package com.example.datastructuresandalgorithms.binary_tree

fun main() {
    val a = Node('A')
    val b = Node('B')
    val c = Node('C')
    val d = Node('D')
    val e = Node('E')
    val f = Node('F')
    val g = Node('G')
    val h = Node('H')
    val x = Node('X')
    a.setLeftChild(b)
    a.setRightChild(c)
    c.setLeftChild(d)
    c.setRightChild(e)
    d.setLeftChild(f)
    d.setRightChild(h)
    e.setRightChild(g)
    b.setLeftChild(x)
    preOrderTraversal(a)
}