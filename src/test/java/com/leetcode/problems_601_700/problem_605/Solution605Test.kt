package com.leetcode.problems_601_700.problem_605

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution605Test {
    private val solution605 = Solution605()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples flowers in pods`(nums: IntArray, newFlowers: Int, expected: Boolean) {
        val result = solution605.canPlaceFlowers(nums, newFlowers)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 0, 0, 0, 1), 1, true),
                Arguments.of(intArrayOf(1, 0, 0, 0, 1), 2, false),
                Arguments.of(intArrayOf(1, 0, 0, 1), 1, false),
                Arguments.of(intArrayOf(1, 0, 0, 0, 1, 0, 0), 2, true),
                Arguments.of(intArrayOf(1, 0, 0, 0, 0, 1), 2, false),
            )
    }
}