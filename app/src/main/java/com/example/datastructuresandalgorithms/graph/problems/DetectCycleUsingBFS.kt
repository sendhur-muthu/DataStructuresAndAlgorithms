package com.example.datastructuresandalgorithms.graph.problems

import java.util.LinkedList

fun detectCycleUsingBFS(numVertices: Int, adj: ArrayList<ArrayList<Int>>): Boolean {
    val visited = BooleanArray(numVertices)

    for (i in 0 until numVertices) {
        if (!visited[i]) {
            if (bfs(i, adj, visited)) return true
        }
    }
    return false
}

fun bfs(src: Int, adj: ArrayList<ArrayList<Int>>, visited: BooleanArray): Boolean {

    val q = LinkedList<Pair<Int, Int>>()
    q.add(Pair(src, -1))
    visited[src] = true

    while (!q.isEmpty()) {
        q.poll()?.let {
            for (v in adj[it.first]) {
                if (it.second == v) {    //Check if the adjacent node v is either the parent the polled node
                    continue
                }
                if (visited[v]) {
                    return true     //Cycle exist as we start in two side of graph but end up in the same node
                } else {
                    q.add(Pair(v, it.first))
                    visited[v] = true
                }
            }
        }
    }

    return false
}