package com.leetcode.problems_1701_1800.problem_1701

class Solution1701 {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        val size = customers.size
        if (size < 2) return customers.first()[1].toDouble()
        var sum: Long = 0
        var endTime = Int.MIN_VALUE

        for (i in customers) {
            endTime = if (endTime < i[0]) i[0] + i[1] else endTime + i[1]
            sum += endTime - i[0]
        }
        return sum.toDouble() / size
    }
}