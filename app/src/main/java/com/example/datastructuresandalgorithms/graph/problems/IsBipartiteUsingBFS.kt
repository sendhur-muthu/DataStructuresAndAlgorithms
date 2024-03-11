package com.example.datastructuresandalgorithms.graph.problems

import java.util.LinkedList

fun isBipartiteUsingBFS(numVertices: Int, adj: ArrayList<ArrayList<Int>>): Boolean {
    val color = Array(numVertices) {
        -1
    }
    for (i in 0 until numVertices) {
        if (color[i] == -1) {
            if (!bfs(i, adj, color)) return false
        }
    }

    return true
}

fun bfs(vertex: Int, adj: ArrayList<ArrayList<Int>>, color: Array<Int>): Boolean {

    val q = LinkedList<Int>()
    q.add(vertex)
    color[vertex] = 0

    while (!q.isEmpty()) {
        q.poll()?.let {
            for (v in adj[it]) {
                if (color[v] == -1) {
                    color[v] = 1 - color[it]
                } else if (color[v] == color[it]) {     //Adjacent node having the same color as the previous node
                    return false
                }
            }
        }
    }

    return true
}