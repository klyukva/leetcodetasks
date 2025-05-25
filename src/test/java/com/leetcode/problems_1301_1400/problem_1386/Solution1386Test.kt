package com.leetcode.problems_1301_1400.problem_1386

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution1386Test {
    private val solution1386 = Solution1386()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples seat allocation 4 row`(n: Int, reservedSeats: Array<IntArray>, expected: Int) {
        val result = solution1386.maxNumberOfFamilies(n, reservedSeats)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    3,
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 8),
                        intArrayOf(2, 6),
                        intArrayOf(3, 1),
                        intArrayOf(3, 10)
                    ),
                    4
                ),
                Arguments.of(
                    2,
                    arrayOf(
                        intArrayOf(2, 1),
                        intArrayOf(1, 8),
                        intArrayOf(2, 6),
                    ),
                    2
                ),
                Arguments.of(
                    4,
                    arrayOf(
                        intArrayOf(4, 3),
                        intArrayOf(1, 4),
                        intArrayOf(4, 6),
                        intArrayOf(1, 7),
                    ),
                    4
                ),
            )
    }
}