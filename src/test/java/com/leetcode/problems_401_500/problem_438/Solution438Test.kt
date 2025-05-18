package com.leetcode.problems_401_500.problem_438

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution438Test {
    private val solution438 = Solution438()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples find all anagrams in string`(s: String, p: String, expected: List<Int>) {
        val result = solution438.findAnagrams(s, p)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("cbaebabacd", "abc", listOf(0, 6)),
                Arguments.of("abab", "ab", listOf(0, 1, 2)),
            )
    }
}