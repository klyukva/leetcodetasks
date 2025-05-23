package com.leetcode.problems_1701_1800.problem_1701

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution1701Test {
    private val solution1701 = Solution1701()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples avg waiting time`(customers: Array<IntArray>, expected: Double) {
        val result = solution1701.averageWaitingTime(customers)
        assertEquals(expected, result, 0.00001)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(arrayOf(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(4, 3)), 5.0),
                Arguments.of(arrayOf(intArrayOf(5, 2), intArrayOf(5, 4), intArrayOf(10, 3), intArrayOf(20, 1)), 3.25),
            )
    }
}