package com.leetcode.problems_101_200.problem_127

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution127Test {
    private val solution127 = Solution127()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples word ladder by 1 letter`(beginWord: String, endWord: String, wordList: List<String>, expected: Int) {
        val result = solution127.ladderLength(beginWord, endWord, wordList)
        assertEquals(expected, result)
    }


    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog"), 5),
                Arguments.of("hit", "cog", listOf("hot", "dot", "dog", "lot", "log"), 0),
            )
    }
}