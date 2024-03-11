package com.example.datastructuresandalgorithms.binary_tree.problems

import java.util.Stack

fun main() {
    /*
    L=L, T=T, E=E
    L=E=T

    each animal can be in only 1 fight at a time


    arr = ['L', 'T'] ==> 1

    arr = ['L', 'T', 'L'] ==> 1

    arr = ['L', 'T', 'L', 'T'] ==> 2


    arr = ['L', 'T', 'L', 'E', 'T'] ==> 1


    arr = ['L', 'T', 'E', 'L', 'T'] ==> 2
    * */
    val circus = arrayListOf('L','T','L', 'E', 'T')
    println("Total fights ${calculateFightUsingStack(circus)}")
}

fun calculateFightUsingStack(circus: ArrayList<Char>): Int {
    var fight = 0
    val set = HashSet<Char>()
    set.add('L')
    set.add('T')
    val stack = Stack<Char>()
    for (i in circus.indices) {
        if (stack.isNotEmpty() && set.contains(stack.peek()) && set.contains(circus[i]) && stack.peek() != circus[i]) {
            stack.pop()
            fight++
        } else {
            stack.push(circus[i])
        }
    }
    return fight
}

fun calculateFight(circus: ArrayList<Char>): Int {
    val hashMap = hashMapOf<Char, Char>()
    hashMap['L'] = 'T'
    var fights = 0

    for (i in 0 until circus.size - 1) {
        if (circus[i] != circus[i + 1] && circus[i+1] != 'E' && circus[i] != 'E') {
            fights++

        }
    }
    return fights
}