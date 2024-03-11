package com.example.datastructuresandalgorithms.graph.problems

import java.util.LinkedList
import kotlin.math.max


/*
* https://www.geeksforgeeks.org/problems/rotten-oranges2536/1
* Solve this using BFS
*
* Space complexity - O(nxm)
* Time complexity - O(nxm)
* */

fun rottenOranges(grid: Array<Array<Int>>): Int {

    val n = grid.size
    val m = grid[0].size

    val visited = ArrayList<ArrayList<Int>>()
    val q = LinkedList<Pair<Pair<Int, Int>, Int>>()
    var timeTaken = 0
    var countFresh = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (grid[i][j] == 1) countFresh++
            if (grid[i][j] == 2) {
                q.add(Pair(Pair(i, j), 0))
                visited[i][j] = 2
            } else {
                visited[i][j] = 0
            }
        }
    }

    val deltaRow = intArrayOf(-1, 0, 1, 0)
    val deltaColumn = intArrayOf(0, 1, 0, -1)

    while (!q.isEmpty()) {
        q.poll()?.let {
            val time = it.second
            val r = it.first.first
            val c = it.first.second
            timeTaken = max(timeTaken, time)
            for (i in 0 until 4) {
                val nRow = r + deltaRow[i]
                val nColumn = c + deltaColumn[i]
                if (nRow in 0..<n && nColumn in 0..<m && visited[nRow][nColumn] == 0 && grid[nRow][nColumn] == 1) {
                    q.add(Pair(Pair(nRow, nColumn), time + 1))
                    visited[nRow][nColumn] = 2
                    countFresh--
                }
            }
        }
    }

    if (countFresh == 0) return timeTaken

    return -1
}