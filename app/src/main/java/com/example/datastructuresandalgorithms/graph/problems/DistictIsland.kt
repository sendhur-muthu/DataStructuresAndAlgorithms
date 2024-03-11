package com.example.datastructuresandalgorithms.graph.problems

fun distinctIsland(grid: ArrayList<ArrayList<Int>>): Int {
    val n = grid.size
    val m = grid[0].size

    val visited = Array(n) {
        Array(m) {
            false
        }
    }
    val set = HashSet<ArrayList<Pair<Int, Int>>>()
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (!visited[i][j] && grid[i][j] == 1) {
                val list = ArrayList<Pair<Int, Int>>()
                dfs(i, j, grid, visited, list, i, j)
                set.add(list)
            }
        }
    }

    return set.size
}

fun dfs(
    row: Int,
    column: Int,
    grid: ArrayList<ArrayList<Int>>,
    visited: Array<Array<Boolean>>,
    list: ArrayList<Pair<Int, Int>>,
    row0: Int,
    column0: Int
) {
    visited[row][column] = true
    list.add(Pair(row - row0, column - column0))    //Subtracting this to find the distinct pairs

    val n = grid.size
    val m = grid[0].size
    val deltaRow = intArrayOf(-1, 0, 1, 0)
    val deltaColumn = intArrayOf(0, 1, 0, -1)

    for (i in 0 until 4) {
        val nRow = row + deltaRow[i]
        val nColumn = column + deltaColumn[i]
        if (nRow in 0..<n && nColumn in 0 until m && !visited[nRow][nColumn] && grid[nRow][nColumn] == 1) {
            dfs(nRow, nColumn, grid, visited, list, row0, column0)
        }
    }
}