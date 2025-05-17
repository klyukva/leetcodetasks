package com.leetcode.problems_001_100.problem_05

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution5Test {
    private val solution5 = Solution5()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max length palindrome`(s: String, expected: String) {
        val result = solution5.longestPalindrome(s)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("aba", "aba"),
                Arguments.of("aabbaa", "aabbaa"),
                Arguments.of("a", "a"),
                Arguments.of("ac", "c"),
                Arguments.of("acvbvcaac", "acvbvca"),
                Arguments.of("acvbbvca", "acvbbvca"),
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb"),
            )
    }
}