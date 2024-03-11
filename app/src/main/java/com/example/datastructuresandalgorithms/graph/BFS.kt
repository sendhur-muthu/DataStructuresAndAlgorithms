package com.example.datastructuresandalgorithms.graph

import java.util.LinkedList

fun bfsOfGraph(v: Int, adj: ArrayList<ArrayList<Int>>): ArrayList<Int> {
    val visited = BooleanArray(v)
    val bfs = ArrayList<Int>()
    val queue = LinkedList<Int>()

    queue.add(0)
    visited[0] = true

    while (!queue.isEmpty()) {
        val vertex = queue.poll()
        bfs.add(vertex)
        for (adjVertex in adj[vertex]) {
            if (!visited[adjVertex]) {
                queue.add(adjVertex)
                visited[adjVertex] = true
            }
        }
    }
    return bfs
}