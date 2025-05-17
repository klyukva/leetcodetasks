package com.leetcode.problems_301_400.problem_349

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution349Test {
    private val solution349 = Solution349()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples parse num`(nums1: IntArray, nums2: IntArray, expected: Set<Int>) {
        val result = solution349.intersection(nums1, nums2)
        assertEquals(expected, result.toSet())
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2), setOf(2)),
                Arguments.of(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4), setOf(9, 4)),
            )
    }
}