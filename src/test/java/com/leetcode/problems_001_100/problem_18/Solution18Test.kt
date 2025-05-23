package com.leetcode.problems_001_100.problem_18

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution18Test {
    private val solution18 = Solution18()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples 4sum`(nums: IntArray, target: Int, expected: List<List<Int>>) {
        val result = solution18.fourSum(nums, target)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    intArrayOf(1, 0, -1, 0, -2, 2),
                    0,
                    listOf(listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1))
                ),
                Arguments.of(
                    intArrayOf(2, 2, 2, 2, 2),
                    8,
                    listOf(listOf(2, 2, 2, 2))
                ),
            )
    }
}