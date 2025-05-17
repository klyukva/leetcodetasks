package com.leetcode.problems_001_100.problem_56

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution56Test {
    private val solution56 = Solution56()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples merge intervals`(intervals: Array<IntArray>, expected: Array<IntArray>) {
        val result = solution56.merge(intervals)
        assertArrayEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
                    arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
                ),
                Arguments.of(
                    arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)),
                    arrayOf(intArrayOf(1, 5)),
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(1, 3),
                        intArrayOf(2, 6),
                        intArrayOf(5, 9),
                        intArrayOf(8, 10),
                        intArrayOf(15, 18)
                    ),
                    arrayOf(intArrayOf(1, 10), intArrayOf(15, 18)),
                ),
                Arguments.of(
                    arrayOf(intArrayOf(1, 4), intArrayOf(2, 3)),
                    arrayOf(intArrayOf(1, 4)),
                ),
            )
    }
}