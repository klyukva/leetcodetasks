package com.leetcode.problems_001_100.problem_31

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution31Test {
    private val solution31 = Solution31()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples next permutation`(nums: IntArray, expected: IntArray) {
        solution31.nextPermutation(nums)
        assertArrayEquals(expected, nums)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 2, 3), intArrayOf(1, 3, 2)),
                Arguments.of(intArrayOf(3, 2, 1), intArrayOf(1, 2, 3)),
                Arguments.of(intArrayOf(1, 3, 2), intArrayOf(2, 1, 3)),
                Arguments.of(intArrayOf(0, 1, 4, 3, 2), intArrayOf(0, 2, 1, 3, 4)),
                Arguments.of(intArrayOf(5, 5, 1, 1, 5, 5, 5), intArrayOf(5, 5, 1, 5, 1, 5, 5)),
            )
    }
}