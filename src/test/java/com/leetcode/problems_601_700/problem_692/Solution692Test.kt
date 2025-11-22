package com.leetcode.problems_601_700.problem_692

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution692Test {
    private val solution692 = Solution692()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples max avg subarray`(words: Array<String>, k: Int, expected: List<String>) {
        val result = solution692.topKFrequent(words, k)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2, listOf("i", "love")),
                Arguments.of(
                    arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"),
                    4,
                    listOf("the", "is", "sunny", "day")
                ),
            )
    }
}