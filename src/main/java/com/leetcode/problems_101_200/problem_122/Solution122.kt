package com.leetcode.problems_101_200.problem_122

class Solution122 {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var minValue = Int.MAX_VALUE
        for (i in prices) {
            when {
                i < minValue -> minValue = i
                i == minValue -> {}
                else -> {
                    profit += i - minValue
                    minValue = i
                }

            }
        }
        return profit
    }
}