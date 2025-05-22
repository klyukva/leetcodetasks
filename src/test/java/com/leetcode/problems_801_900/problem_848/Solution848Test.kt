package com.leetcode.problems_801_900.problem_848

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution848Test {
    private val solution848 = Solution848()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples cumulative shift letters `(s: String, shifts: IntArray, expected: String) {
        val result = solution848.shiftingLetters(s, shifts)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("abc", intArrayOf(3, 5, 9), "rpl"),
                Arguments.of("aaa", intArrayOf(1, 2, 3), "gfd"),
            )
    }
}