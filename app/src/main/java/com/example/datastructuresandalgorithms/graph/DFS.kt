package com.example.datastructuresandalgorithms.graph

fun dfsOfGraph(numVertices: Int, adj: ArrayList<ArrayList<Int>>): ArrayList<Int> {
    val dfs = ArrayList<Int>()
    //Assuming the vertex starts from 1. So using a 1-based index
    val visited = BooleanArray(numVertices + 1)
    dfs(1, visited, adj, dfs)

    return dfs
}

fun dfs(vertex: Int, visited: BooleanArray, adj: ArrayList<ArrayList<Int>>, dfs: ArrayList<Int>) {
    visited[vertex] = true
    dfs.add(vertex)
    for (v in adj[vertex]) {
        if (!visited[v]) {
            dfs(v, visited, adj, dfs)
        }
    }
}


/*
* Time complexity = O(N) + O(2E) - Where O(2E) is the total degree of all the nodes
* Space complexity = O(N)*/
