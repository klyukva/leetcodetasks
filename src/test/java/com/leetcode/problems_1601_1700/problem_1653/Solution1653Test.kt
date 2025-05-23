package com.leetcode.problems_1601_1700.problem_1653

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution1653Test {
    private val solution1653 = Solution1653()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples minimum deletion from string`(s: String, expected: Int) {
        val result = solution1653.minimumDeletions(s)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("aaa", 0),
                Arguments.of("aababbab", 2),
                Arguments.of("bbaaaaabb", 2),
                Arguments.of("baaaaaabaaabbbbbaabb", 4),
                Arguments.of("baababbaabbaaabaabbabbbabaaaaaabaabababaaababbb", 18),
            )
    }
}