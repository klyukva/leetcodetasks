package com.leetcode.problems_001_100.problem74

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution74Test {
    private val solution74 = Solution74()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples search 2d matrix`(matrix: Array<IntArray>, target: Int, expected: Boolean) {
        val result = solution74.searchMatrix(matrix, target)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)),
                    3,
                    true
                ),
                Arguments.of(
                    arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)),
                    13,
                    false
                ),
                Arguments.of(
                    arrayOf(intArrayOf(1, 1)),
                    2,
                    false
                ),
            )
    }
}