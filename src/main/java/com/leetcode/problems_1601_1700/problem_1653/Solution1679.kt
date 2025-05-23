package com.leetcode.problems_1601_1700.problem_1653

class Solution1679 {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val remainderMap = mutableMapOf<Int, Int>()

        var result = 0
        for (i in nums) {
            if (i >= k) continue

            if ((remainderMap[k - i] ?: 0) > 0) {
                remainderMap.computeIfPresent(k - i) { key, v -> v - 1}
                result++
            } else {
                remainderMap.compute(i) { key, v -> v?.let { it + 1 } ?: 1 }
            }
        }

        return result
    }
}