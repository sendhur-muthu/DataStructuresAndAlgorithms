package com.example.datastructuresandalgorithms.graph.problems

fun isBipartiteUsingDFS(numVertices: Int, adj: ArrayList<ArrayList<Int>>): Boolean {
    val color = IntArray(numVertices) {
        -1
    }
    for (i in 0 until numVertices) {
        if (color[i] == -1) {
            color[i] = 0
            if (!dfs(i, adj, color)) return false
        }
    }
    return true
}

fun dfs(vertex: Int, adj: ArrayList<ArrayList<Int>>, color: IntArray): Boolean {

    for (v in adj[vertex]) {
        if (color[v] == -1) {
            color[v] = 1 - color[vertex]
            dfs(v, adj, color)
        } else if (color[vertex] == color[v]) {
            return false
        }
    }

    return true
}