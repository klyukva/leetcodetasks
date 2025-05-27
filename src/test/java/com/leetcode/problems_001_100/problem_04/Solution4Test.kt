package com.leetcode.problems_001_100.problem_04

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution4Test {
    private val solution4 = Solution4()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples meridian sorted arrays`(nums1: IntArray, nums2: IntArray, expected: Double) {
        val result = solution4.findMedianSortedArrays(nums1, nums2)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 3), intArrayOf(2), 2.0),
                Arguments.of(intArrayOf(1, 2), intArrayOf(3, 4), 2.5),
            )
    }
}