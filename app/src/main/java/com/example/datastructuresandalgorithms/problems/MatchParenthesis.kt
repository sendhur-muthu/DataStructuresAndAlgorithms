package com.example.datastructuresandalgorithms.problems

import com.example.datastructuresandalgorithms.stack.Stack

fun main() {
    val inputString = "(){{()}}}"
    println(hasMatchingParenthesis(inputString))
}

fun hasMatchingParenthesis(inputString: String): Boolean {
    val matchingParentMap = hashMapOf<Char, Char>() //Every closing bracket will have a opening bracket
    val openingParentSet = hashSetOf<Char>()    //This set will contain all the opening brackets
    matchingParentMap[')'] = '('
    matchingParentMap['}'] = '{'
    matchingParentMap[']'] = '['
    openingParentSet.addAll(matchingParentMap.values)
    try {
        val stack = Stack<Char>()
        inputString.forEach {
            if (openingParentSet.contains(it)) {
                stack.push(it)
            }
            if (matchingParentMap.containsKey(it)) {
                val data = stack.pop()
                if (data != matchingParentMap[it]) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    } catch (exception: Exception) {
        println(exception::class.java.name)
        return false
    }
}
