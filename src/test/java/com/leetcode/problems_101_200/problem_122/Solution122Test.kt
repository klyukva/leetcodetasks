package com.leetcode.problems_101_200.problem_122

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution122Test {
    private val solution122 = Solution122()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples reverse words`(prices: IntArray, expected: Int) {
        val result = solution122.maxProfit(prices)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(7, 1, 5, 3, 6, 4), 7),
                Arguments.of(intArrayOf(7, 6, 4, 3, 1), 0),
                Arguments.of(intArrayOf(1, 2, 3, 4, 5), 4),
            )
    }
}