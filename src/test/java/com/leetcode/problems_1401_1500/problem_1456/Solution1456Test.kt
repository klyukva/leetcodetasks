package com.leetcode.problems_1401_1500.problem_1456

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution1456Test {
    private val solution1456 = Solution1456()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max numbers in substring k size`(s: String, k: Int, expected: Int) {
        val result = solution1456.maxVowels(s, k)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("abciiidef", 3, 3),
                Arguments.of("aeiou", 2, 2),
                Arguments.of("leetcode", 3, 2),
            )
    }
}