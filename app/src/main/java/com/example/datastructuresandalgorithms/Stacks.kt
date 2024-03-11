package com.example.datastructuresandalgorithms

import java.util.Stack

fun main(args: Array<String>) {
    val stack: Stack<String> = Stack()
    stack.push("Iron man")
    stack.push("Naruto")
    stack.push("One Punch man")
    stack.push("Batman")
    //stack.pop()
    println(stack.peek())
    println(stack.search("Sendhur"))

    /* Stack
       LIFO
       push() to add to the top
       pop() to remove from the top

       Uses of Stack:
       1. Undo/Redo features in the IDE/Text editors
       2. Moving back/forward through browser history
       3. Backtracking algorithms(Maze, File directories)
    * */
}