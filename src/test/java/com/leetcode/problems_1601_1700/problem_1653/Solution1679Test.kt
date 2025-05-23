package com.leetcode.problems_1601_1700.problem_1653

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution1679Test {
    private val solution1679 = Solution1679()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max number k sum pairs`(nums: IntArray, k: Int, expected: Int) {
        val result = solution1679.maxOperations(nums, k)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 2, 3, 4), 5, 2),
                Arguments.of(intArrayOf(3, 1, 3, 4, 3), 6, 1),
            )
    }
}