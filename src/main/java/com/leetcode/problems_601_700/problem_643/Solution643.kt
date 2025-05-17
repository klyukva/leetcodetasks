package com.leetcode.problems_601_700.problem_643

class Solution643 {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var left = 0
        var sum = 0
        for (i in 0..k-1) {
            sum += nums[i]
        }
        var maxSum = sum
        for (i in k..nums.size - 1) {
            sum = sum - nums[left] + nums[i]
            maxSum = maxOf(sum, maxSum)
            left++
        }

        return maxSum.toDouble() / k
    }
}