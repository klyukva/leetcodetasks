package com.leetcode.problems_201_300.problem_209

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution209Test {
    private val solution209 = Solution209()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples minimum subarray sum`(nums: IntArray, target: Int, expected: Int) {
        val result = solution209.minSubArrayLen(target, nums)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(2, 3, 1, 2, 4, 3), 7, 2),
                Arguments.of(intArrayOf(1, 4, 4), 4, 1),
                Arguments.of(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1), 11, 0),
                Arguments.of(intArrayOf(1, 2, 3, 4, 5), 11, 3),
                Arguments.of(intArrayOf(12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12), 213, 8),
            )
    }

}