package com.leetcode.problems_001_100.problem_33

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution33Test {
    private val solution33 = Solution33()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples search rotated array`(nums: IntArray, target: Int, expected: Int) {
        val result = solution33.search(nums, target)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0, 4),
                Arguments.of(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3, -1),
                Arguments.of(intArrayOf(1), 0, -1),
                Arguments.of(intArrayOf(8, 9, 10, 1, 2, 3, 4, 5, 6, 7), 11, -1),
            )
    }
}