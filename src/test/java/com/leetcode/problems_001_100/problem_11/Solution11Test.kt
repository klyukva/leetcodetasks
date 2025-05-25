package com.leetcode.problems_001_100.problem_11

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution11Test {
    private val solution11 = Solution11()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max area in heights array`(height: IntArray, expected: Int) {
        val result = solution11.maxArea(height)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7), 49),
                Arguments.of(intArrayOf(1, 1), 1),
                Arguments.of(intArrayOf(1, 2, 1), 2),
            )
    }
}