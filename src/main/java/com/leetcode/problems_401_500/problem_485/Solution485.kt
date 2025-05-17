package com.leetcode.problems_401_500.problem_485

import kotlin.math.max

class Solution485 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxNumOne = 0
        var currentOneCount = 0
        for (num in nums) {
            if (num == 0) {
                maxNumOne = max(currentOneCount, maxNumOne)
                currentOneCount = 0
            } else currentOneCount++
        }

        return max(currentOneCount, maxNumOne)
    }
}