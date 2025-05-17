package com.leetcode.problems_401_500.problem_424

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution424Test {
    private val solution424 = Solution424()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples character replacement max len`(s: String, k: Int, expected: Int) {
        val result = solution424.characterReplacement(s, k)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("ABAB", 2, 4),
                Arguments.of("AABABBA", 1, 4),
            )
    }
}