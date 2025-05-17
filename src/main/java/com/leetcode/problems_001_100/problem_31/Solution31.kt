package com.leetcode.problems_001_100.problem_31

class Solution31 {
    fun nextPermutation(nums: IntArray) {
        var i = nums.size - 2

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--
        }

        if (i >= 0) {
            var j = nums.size - 1
            while (nums[j] <= nums[i]) {
                j--
            }
            swap(nums, i, j)
        }

        reverse(nums, i + 1)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    private fun reverse(nums: IntArray, start: Int) {
        var left = start
        var right = nums.size - 1
        while (left < right) {
            swap(nums, left, right)
            left++
            right--
        }
    }
}