package com.example.datastructuresandalgorithms.graph

import java.util.LinkedList

/*Calculate the in degrees of all nodes and insert nodes with 0 in degree into the queue.
* Reduce the in degree of the adjacent node of the node in queue. And if that in degree is 0 then add it to the queue and repeat
* */

fun topoUsingKhanAlgorithm(numVertices: Int, adj: ArrayList<ArrayList<Int>>): ArrayList<Int> {
    val inDegree = IntArray(numVertices)

    //Filling up in-degrees
    for (i in 0 until numVertices) {
        for (v in adj[i]) {
            inDegree[v]++
        }
    }
    val q = LinkedList<Int>()
    val topo = ArrayList<Int>()
    //Looping through in-degrees to add it to the queue if it is 0
    for (i in 0 until numVertices) {
        if (inDegree[i] == 0) {
            q.add(i)
        }
    }
    //Time complexity - O(V+E)
    while (!q.isEmpty()) {
        q.poll()?.let {
            topo.add(it)
            //Node is added to Toposort so reduce its adjacent nodes in-degree and add it to queue if in-degree = 0
            for (v in adj[it]) {
                inDegree[v]--
                if (inDegree[v] == 0) q.add(v)
            }
        }
    }

    /*
    * To detect cycle - At any node where the cycle exist will not have a reduced in-degree of 0. So the sort will not work further.
    * if (topo.size == numVertices) -- No cycle
    * else -- Cycle exist.*/

    return topo
}