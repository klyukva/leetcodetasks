package com.leetcode.problems_001_100.problem_11

class Solution11 {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxVolume = 0

        while (left < right) {
            maxVolume = maxOf(maxVolume, (right - left) * minOf(height[left], height[right]))
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxVolume
    }
}