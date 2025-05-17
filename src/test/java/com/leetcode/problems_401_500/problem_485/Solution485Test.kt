package com.leetcode.problems_401_500.problem_485

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution485Test {

    private val solution485 = Solution485()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max consecutive ones in array`(nums: IntArray, expected: Int) {
        val result = solution485.findMaxConsecutiveOnes(nums)
        assertEquals(result, expected)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 1, 0, 1, 1, 1), 3),
                Arguments.of(intArrayOf(1, 1, 0, 1, 1, 0), 2),
                Arguments.of(intArrayOf(), 0),
                Arguments.of(intArrayOf(0, 0, 0), 0),
                Arguments.of(intArrayOf(1, 0, 1), 1),
            )
    }

}