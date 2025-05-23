package com.leetcode.problems_001_100.problem_02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution2Test {
    private val solution2 = Solution2()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples add two numbers linked list`(l1: ListNode?, l2: ListNode?, expected: ListNode?) {
        val result = solution2.addTwoNumbers(l1, l2)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    ListNode(3)
                        .let { ListNode(4, next = it) }
                        .let { ListNode(2, next = it) },
                    ListNode(4)
                        .let { ListNode(6, next = it) }
                        .let { ListNode(5, next = it) },
                    ListNode(8)
                        .let { ListNode(0, next = it) }
                        .let { ListNode(7, next = it) },
                ),
                Arguments.of(
                    ListNode(9)
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) },
                    ListNode(9)
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) },
                    ListNode(1)
                        .let { ListNode(0, next = it) }
                        .let { ListNode(0, next = it) }
                        .let { ListNode(0, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(9, next = it) }
                        .let { ListNode(8, next = it) },
                ),
            )
    }
}