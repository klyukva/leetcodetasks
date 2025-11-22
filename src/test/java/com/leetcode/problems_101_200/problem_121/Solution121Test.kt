package com.leetcode.problems_101_200.problem_121

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution121Test {
    private val solution121 = Solution121()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples reverse words`(prices: IntArray, expected: Int) {
        val result = solution121.maxProfit(prices)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(7, 1, 5, 3, 6, 4), 5),
                Arguments.of(intArrayOf(7, 6, 4, 3, 1), 0),
            )
    }
}