package com.leetcode.problems_1201_1300.problem_1248

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution1248Test {
    private val solution1248 = Solution1248()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples count odd count subarray`(nums: IntArray, k: Int, expected: Int) {
        val result = solution1248.numberOfSubarrays(nums, k)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 1, 2, 1, 1), 3, 2),
                Arguments.of(intArrayOf(2, 4, 6), 1, 0),
                Arguments.of(intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2), 2, 16),
            )
    }
}