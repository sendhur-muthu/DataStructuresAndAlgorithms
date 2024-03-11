package com.example.datastructuresandalgorithms.graph

import java.util.LinkedList
import java.util.Queue

fun main() {
    println(isTopologicalSort(2, arrayOf(intArrayOf(0, 1))))
}

//207. Course Schedule - Use topological sort to check if you can finish all courses.
fun isTopologicalSort(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    val adjacentVertices = ArrayList<ArrayList<Int>>()

    //Fill adjacent vertices using prerequisites
    for(i in 0 until numCourses) {
        adjacentVertices.add(ArrayList())
    }
    for (i in prerequisites.indices) {
        adjacentVertices[prerequisites[i][1]].add(prerequisites[i][0])
    }
    //Calculate in degrees for each vertices and add it to queue if the vertices has in degree 0.
    val inDegrees = IntArray(numCourses)
    val q = LinkedList<Int>()
    for (i in 0 until numCourses) {
        for (adj in adjacentVertices[i]) {
            inDegrees[adj]++
        }
    }
    for (i in 0 until numCourses) {
        if (inDegrees[i] == 0) q.add(i)
    }

    //Topological sort begins
    val topo = ArrayList<Int>()
    while(!q.isEmpty()) {
        val vertex = q.poll()
        topo.add(vertex)
        for (adj in adjacentVertices[vertex]) {
            inDegrees[adj]--
            if (inDegrees[adj] == 0) q.add(adj)
        }
    }
    if (topo.size == numCourses) {
        println(topo)
        return true
    }

    return false
}