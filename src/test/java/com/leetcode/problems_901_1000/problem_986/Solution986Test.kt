package com.leetcode.problems_901_1000.problem_986

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution986Test {
    private val solution986 = Solution986()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples interval intersection`(
        firstList: Array<IntArray>, secondList: Array<IntArray>, expected: Array<IntArray>
    ) {
        val result = solution986.intervalIntersection(firstList, secondList)
        assertArrayEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    arrayOf(intArrayOf(0, 2), intArrayOf(5, 10), intArrayOf(13, 23), intArrayOf(24, 25)),
                    arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26)),
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(5, 5),
                        intArrayOf(8, 10),
                        intArrayOf(15, 23),
                        intArrayOf(24, 24),
                        intArrayOf(25, 25)
                    ),
                ),
                Arguments.of(
                    arrayOf(intArrayOf(1, 3), intArrayOf(5, 9)),
                    emptyArray<IntArray>(),
                    emptyArray<IntArray>(),
                ),
            )
    }
}