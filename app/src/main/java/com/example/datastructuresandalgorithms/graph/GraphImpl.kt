package com.example.datastructuresandalgorithms.graph

fun main() {
    val graph = AdjacentMatrixGraph(3, Graph.GraphType.DIRECTED)
    graph.addEdge(0, 1)
    graph.addEdge(2, 1)
    graph.addEdge(2, 0)

    println("The in-degree of 1 is ${graph.getInDegree(1)}")
}