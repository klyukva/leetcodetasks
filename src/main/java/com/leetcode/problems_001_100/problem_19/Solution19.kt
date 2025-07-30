package com.leetcode.problems_001_100.problem_19

class Solution19 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null) return null
        var currentN = 0
        var left: ListNode? = null

        var right = head

        while(right != null) {
            right = right.next
            if (currentN == n) {
                left = left?.next ?: head
            } else {
                currentN++
            }
        }
        if (left == null) return head.next

        if (left.next != null) {
            left.next = left.next!!.next
        }

        return head
    }

}