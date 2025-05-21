package com.leetcode.problems_501_600.problem_523

class Solution523 {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        if (nums.size < 2) {
            return false
        }

        val remainderMap = mutableMapOf<Int, Int>()

        var partSum = nums[0]
        remainderMap[partSum % k] = 0

        for (i in 1..nums.size - 1) {
            partSum += nums[i]
            val remainder = partSum % k
            if (remainder == 0) {
                return true
            }
            if (remainderMap[remainder]?.let { i - it > 1 } ?: false) {
                return true
            }
            remainderMap.putIfAbsent(remainder, i)
        }

        return false
    }
}