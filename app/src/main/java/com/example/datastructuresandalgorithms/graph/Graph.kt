package com.example.datastructuresandalgorithms.graph

interface Graph {

    enum class GraphType{
        DIRECTED,
        UNDIRECTED
    }

    fun addEdge(v1: Int, v2: Int)

    fun getAdjacentList(v: Int): List<Int>
}