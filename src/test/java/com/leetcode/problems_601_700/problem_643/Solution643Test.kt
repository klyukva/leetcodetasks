package com.leetcode.problems_601_700.problem_643

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution643Test {
    private val solution643 = Solution643()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max avg subarray`(nums: IntArray, k: Int, expected: Double) {
        val result = solution643.findMaxAverage(nums, k)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 12, -5, -6, 50, 3), 4, 12.75),
                Arguments.of(intArrayOf(5), 1, 5.0),
            )
    }
}