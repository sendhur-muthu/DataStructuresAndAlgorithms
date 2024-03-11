package com.example.datastructuresandalgorithms.graph.problems

fun detectCycleUsingDFS(numVertices: Int, adj: ArrayList<ArrayList<Int>>): Boolean {

    val visited = BooleanArray(numVertices)
    for (i in 0 until numVertices) {
        if (!visited[i]) {
            if (dfs(i, -1, adj, visited)) return true
        }
    }

    return false
}

fun dfs(node: Int, parent: Int, adj: ArrayList<ArrayList<Int>>, visited: BooleanArray): Boolean {

    visited[node] = true
    for (v in adj[node]) {
        if (v == parent) {
            continue
        }
        return if (visited[v]) {
            true
        } else {
            dfs(v, node, adj, visited)
        }
    }

    return false
}
