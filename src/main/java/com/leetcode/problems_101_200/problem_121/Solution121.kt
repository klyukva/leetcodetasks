package com.leetcode.problems_101_200.problem_121

class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var minValue = Int.MAX_VALUE
        for (i in prices) {
            if (i - minValue > profit) {
                profit = i - minValue
            }
            if (i < minValue) {
                minValue = i
            }
        }
        return profit
    }
}