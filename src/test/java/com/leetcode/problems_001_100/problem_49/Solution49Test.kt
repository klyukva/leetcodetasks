package com.leetcode.problems_001_100.problem_49

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution49Test {
    private val solution49 = Solution49()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples group anagrams`(strs: Array<String>, expected: List<List<String>>) {
        val result = solution49.groupAnagrams(strs)
        assertThat(
            normalizeNestedList(result),
            containsInAnyOrder(*expected.toTypedArray())
        )
    }

    private fun normalizeNestedList(nestedList: List<List<String>>) =
        nestedList
            .map { innerList -> innerList.sorted() } // Сортируем каждый внутренний список
            .sortedBy { it.joinToString() }

    companion object {
        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
                    listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))
                ),
                Arguments.of(
                    arrayOf(""),
                    listOf(listOf(""))
                ),
                Arguments.of(
                    arrayOf("a"),
                    listOf(listOf("a"))
                ),
            )
    }
}