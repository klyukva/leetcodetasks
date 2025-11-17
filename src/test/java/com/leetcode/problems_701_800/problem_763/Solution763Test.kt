package com.leetcode.problems_701_800.problem_763

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution763Test {

    private val solution763 = Solution763()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `partition labels same letter `(s: String, expectedSizeList: List<Int>) {
        val result = solution763.partitionLabels(s)
        assertEquals(expectedSizeList, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of("ababcbacadefegdehijhklij", listOf(9, 7, 8)),
                Arguments.of("eccbbbbdec", listOf(10)),
                Arguments.of("ababcc", listOf(4, 2)),
            )
    }
}