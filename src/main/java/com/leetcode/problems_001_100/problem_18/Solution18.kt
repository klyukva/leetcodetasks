package com.leetcode.problems_001_100.problem_18

class Solution18 {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val size = nums.size
        if (size < 4) return emptyList()

        nums.sort()
        val result = mutableListOf<List<Int>>()

        for (i in 0..size - 4) {
            if (i > 0 && nums[i] == nums[i - 1]) continue

            for (j in i + 1..size - 3) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue

                var left = j + 1
                var right = size - 1

                while (left < right) {
                    val sum: Long = nums[i].toLong() + nums[j] + nums[left] + nums[right]

                    when {
                        sum < target -> left++
                        sum > target -> right--
                        else -> {
                            result.add(listOf(nums[i], nums[j], nums[left], nums[right]))

                            while (left < right && nums[left] == nums[left + 1]) left++
                            while (left < right && nums[right] == nums[right - 1]) right--
                            left++
                            right--
                        }
                    }
                }
            }
        }

        return result
    }
}