package com.example.datastructuresandalgorithms.graph

import java.util.Stack

fun topoSortUsingDFS(numVertices: Int, adj: ArrayList<ArrayList<Int>>): ArrayList<Int> {
    val visited = BooleanArray(numVertices)
    val stack = Stack<Int>()
    for (i in 0 until numVertices) {
        if (!visited[i]) {
            dfs(i, visited, adj, stack)
        }
    }
    val list = ArrayList<Int>()
    while (!stack.isEmpty()) {
        list.add(stack.pop())
    }
    return list
}

fun dfs(vertex: Int, visited: BooleanArray, adj: ArrayList<ArrayList<Int>>, stack: Stack<Int>) {
    visited[vertex] = true

    for (v in adj[vertex]) {
        if (!visited[v]) {
            dfs(v, visited, adj, stack)
        }
    }

    stack.push(vertex)
}