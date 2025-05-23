package com.leetcode.problems_101_200.problem_151

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution151Test {
    private val solution151 = Solution151()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples reverse words`(s: String, expected: String) {
        val result = solution151.reverseWords(s)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a"),
            )
    }
}