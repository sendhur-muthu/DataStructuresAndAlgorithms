package com.example.datastructuresandalgorithms.graph

class AdjacentMatrixGraph(private val numVertices: Int, private val type: Graph.GraphType) : Graph {

    private var adjacencyMatrix: Array<IntArray> = Array(numVertices) { IntArray(numVertices) }

    init {
        for (i in 0 until numVertices) {
            for (j in 0 until numVertices) {
                adjacencyMatrix[i][j] = 0
            }
        }
    }

    override fun addEdge(v1: Int, v2: Int) {
        if (v1 >= numVertices || v1 < 0 || v2 >= numVertices || v2 < 0) {
            return
        }
        adjacencyMatrix[v1][v2] = 1
        if (type == Graph.GraphType.UNDIRECTED) {
            adjacencyMatrix[v2][v1] = 1
        }
    }

    override fun getAdjacentList(v: Int): List<Int> {
        if (v >= numVertices || v < 0) {
            return emptyList()
        }
        val list = ArrayList<Int>()
        for (i in 0 until numVertices) {
            if (adjacencyMatrix[v][i] == 1) {
                list.add(i)
            }
        }
        return list.sorted()
    }

    fun getInDegree(v: Int): Int {
        var inDegree = 0
        for (i in 0 until numVertices) {
            if (adjacencyMatrix[i][v] == 1) {
                inDegree++
            }
        }
        return inDegree
    }
}