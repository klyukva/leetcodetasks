package com.leetcode.problems_1201_1300.problem_1248

class Solution1248 {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        var leftOdd = -1
        var rightOdd = 0
        var left = 0
        var currentOdd = 0
        var result = 0

        for (i in nums.indices) {
            if (nums[i] % 2 == 1) {
                if (currentOdd == 0) {
                    leftOdd = i
                }
                currentOdd++
                if (currentOdd == k) {
                    rightOdd = i
                }
                if (currentOdd - 1 == k) {
                    result += (leftOdd - left + 1) * (i - rightOdd)
                    left = leftOdd + 1
                    rightOdd = i
                    currentOdd--
                    for (j in leftOdd + 1..i) {
                        if (nums[j] % 2 == 1) {
                            leftOdd = j
                            break
                        }
                    }
                }
            }
            if (i == nums.size - 1 && currentOdd == k) {
                result += (leftOdd - left + 1) * (i - rightOdd + 1)
            }
        }

        return result
    }
}