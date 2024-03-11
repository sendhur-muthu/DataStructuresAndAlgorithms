package com.example.datastructuresandalgorithms.graph.problems

import java.util.LinkedList

fun detectCycleInDirectedGraph(numVertices: Int, adj: ArrayList<ArrayList<Int>>): Boolean {

    val visited = BooleanArray(numVertices)
    val pathVisited = BooleanArray(numVertices)

    for (i in 0 until numVertices) {
        if (!visited[i]) {
            dfsToDetectCycleInDirectedGraph(i, adj, visited, pathVisited)
        }
    }

    return false
}

fun dfsToDetectCycleInDirectedGraph(src: Int, adj: ArrayList<ArrayList<Int>>, visited: BooleanArray, pathVisited: BooleanArray): Boolean {

    visited[src] = true
    pathVisited[src] = true

    for (v in adj[src]) {
        if (!visited[v]) {
            if (dfsToDetectCycleInDirectedGraph(v, adj, visited, pathVisited)) return true
        } else if (pathVisited[v]) return true
    }
    pathVisited[src] = false
    return false
}