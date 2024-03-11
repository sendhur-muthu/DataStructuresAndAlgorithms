package com.example.datastructuresandalgorithms.problems.two_pointers

 class ListNode(var `val`: Int) {
     var next: ListNode? = null
 }
fun main() {
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next?.next = ListNode(4)

    val list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next?.next = ListNode(4)

    val list = mergeSortedLinkedList(list1, list2)
    var mergedList = list
    while (mergedList != null) {
        println(mergedList.`val`)
        mergedList = mergedList.next
    }
}

fun mergeSortedLinkedList(list1: ListNode?, list2: ListNode?): ListNode? {
    val list = ListNode(0)
    var tail = list

    var l1 = list1
    var l2 = list2

    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            tail.next = l1
            l1 = l1.next
        } else {
            tail.next = l2
            l2 = l2.next
        }
        tail = tail.next!!
    }
    if (l1 != null) {
        tail.next = l1
    } else if (l2 != null) {
        tail.next = l2
    }
    return list.next
}
