package com.leetcode.problems_201_300.problem_209

class Solution209 {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var start = 0
        var end = 0
        var count = Int.MAX_VALUE
        var sum = 0
        while(end < nums.size) {
            sum += nums[end]
            end++
            while(sum >= target) {
                count = minOf(end - start, count)
                sum -= nums[start++]
            }
        }
        return if(count == Int.MAX_VALUE) 0 else count
    }
}