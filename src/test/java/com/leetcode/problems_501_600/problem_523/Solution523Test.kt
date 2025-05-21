package com.leetcode.problems_501_600.problem_523

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution523Test {

    private val solution523 = Solution523()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples subarray sum divides by k`(nums: IntArray, k: Int, expected: Boolean) {
        val result = solution523.checkSubarraySum(nums, k)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(23, 2, 4, 6, 7), 6, true),
                Arguments.of(intArrayOf(23, 2, 6, 4, 7), 6, true),
                Arguments.of(intArrayOf(23, 2, 6, 4, 7), 13, false),
                Arguments.of(intArrayOf(0, 0), 1, true),
                Arguments.of(intArrayOf(5, 0, 0, 0), 3, true),
                Arguments.of(intArrayOf(1, 2, 3), 5, true),
            )
    }
}