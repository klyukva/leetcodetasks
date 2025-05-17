package com.leetcode.problems_001_100.problem_03

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution3Test {

    private val solution3 = Solution3()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples substring different char`(s: String, expected: Int) {
        val result = solution3.lengthOfLongestSubstring(s)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("abcbad", 4),
                Arguments.of("", 0),
            )
    }
}