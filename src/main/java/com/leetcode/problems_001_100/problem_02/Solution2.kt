package com.leetcode.problems_001_100.problem_02

class Solution2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var left = l1
        var right = l2
        var transfer = 0
        var result: ListNode? = null
        var currentResultNode: ListNode? = null

        while (right != null || left != null) {
            val currentSum = (left?.`val` ?: 0) + (right?.`val` ?: 0) + transfer
            currentResultNode = currentResultNode?.let {
                it.next = ListNode(currentSum % 10)
                it.next
            } ?: run {
                result = ListNode(currentSum % 10)
                result
            }
            transfer = currentSum / 10
            right = right?.next
            left = left?.next
        }

        if (transfer != 0) {
            currentResultNode?.next = ListNode(transfer)
        }

        return result
    }
}