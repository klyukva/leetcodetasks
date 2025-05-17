package com.leetcode.problems_001_100.problem_08

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution8Test {

    private val solution8 = Solution8()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples parse num`(s: String, expected: Int) {
        val result = solution8.myAtoi(s)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("42", 42),
                Arguments.of(" -042", -42),
                Arguments.of("1337c0d3", 1337),
                Arguments.of("0-1", 0),
                Arguments.of("words and 987", 0),
                Arguments.of("-91283472332", Int.MIN_VALUE),
                Arguments.of("91283472332", Int.MAX_VALUE),
                Arguments.of("-6147483648", Int.MIN_VALUE),
                Arguments.of("+1", 1),
            )
    }

}