package com.leetcode.problems_301_400.problem_347

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution347Test {
    private val solution347 = Solution347()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples top k frequent elements`(nums: IntArray, k: Int, expected: IntArray) {
        val result = solution347.topKFrequent(nums, k)
        assertThat(
            result.toList(),
            containsInAnyOrder(*expected.toList().toTypedArray())
        )
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), 2, intArrayOf(1, 2)),
                Arguments.of(intArrayOf(1), 1, intArrayOf(1)),
            )
    }
}