package com.leetcode.problems_401_500.problem_443

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution443Test {
    private val solution443 = Solution443()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples compress char array`(chars: CharArray, resultArray: CharArray, expected: Int) {
        val result = solution443.compress(chars)
        assertArrayEquals(chars, resultArray)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    charArrayOf('o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'),
                    charArrayOf('o', '1', '0', 'o', 'o', 'o', 'o', 'o', 'o', 'o'),
                    3
                ),
                Arguments.of(
                    charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c'),
                    charArrayOf('a', '2', 'b', '2', 'c', '3', 'c'),
                    6
                ),
                Arguments.of(
                    charArrayOf('a'),
                    charArrayOf('a'),
                    1
                ),
                Arguments.of(
                    charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b'),
                    charArrayOf('a','b','1','2','b','b','b','b','b','b','b','b','b'),
                    4
                ),
            )
    }
}