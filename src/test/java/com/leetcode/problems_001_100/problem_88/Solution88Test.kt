package com.leetcode.problems_001_100.problem_88

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution88Test {

    private val solution88 = Solution88()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples merge sorted arrays`(nums1: IntArray, m: Int, nums2: IntArray, n: Int, result: IntArray) {
        solution88.merge(nums1, m, nums2, n)
        assertArrayEquals(result, nums1)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    intArrayOf(1, 2, 3, 0, 0, 0), 3,
                    intArrayOf(2, 5, 6), 3,
                    intArrayOf(1, 2, 2, 3, 5, 6)
                ),
                Arguments.of(
                    intArrayOf(0), 0,
                    intArrayOf(1), 1,
                    intArrayOf(1)
                ),
                Arguments.of(
                    intArrayOf(1, 2, 3), 3,
                    intArrayOf(), 0,
                    intArrayOf(1, 2, 3)
                ),
                Arguments.of(
                    intArrayOf(1, 3, 5, 0, 0, 0), 3,
                    intArrayOf(2, 4, 6), 3,
                    intArrayOf(1, 2, 3, 4, 5, 6)
                ),
                Arguments.of(
                    intArrayOf(7, 8, 9, 0, 0, 0), 3,
                    intArrayOf(2, 5, 6), 3,
                    intArrayOf(2, 5, 6, 7, 8, 9)
                ),
                Arguments.of(
                    intArrayOf(1, 3, 5, 0, 0, 0), 3,
                    intArrayOf(4, 8, 10), 3,
                    intArrayOf(1, 3, 4, 5, 8, 10)
                ),
            )
    }

}