package com.leetcode.problems_001_100.problem_33

class Solution33 {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) / 2

            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }

        return -1
    }
}