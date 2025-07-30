package com.leetcode.problems_001_100.problem_19

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution19Test {
    private val solution19 = Solution19()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples 4sum`(head: ListNode?, n: Int, expected: ListNode?) {
        val result = solution19.removeNthFromEnd(head, n)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    ListNode(5)
                        .let { ListNode(4, next = it) }
                        .let { ListNode(3, next = it) }
                        .let { ListNode(2, next = it) }
                        .let { ListNode(1, next = it) },
                    2,
                    ListNode(5)
                        .let { ListNode(3, next = it) }
                        .let { ListNode(2, next = it) }
                        .let { ListNode(1, next = it) }
                ),
                Arguments.of(
                    ListNode(5)
                        .let { ListNode(4, next = it) }
                        .let { ListNode(3, next = it) }
                        .let { ListNode(2, next = it) }
                        .let { ListNode(1, next = it) },
                    5,
                    ListNode(5)
                        .let { ListNode(4, next = it) }
                        .let { ListNode(3, next = it) }
                        .let { ListNode(2, next = it) },
                ),
                Arguments.of(
                    ListNode(1),
                    1,
                    null
                ),
                Arguments.of(
                    ListNode(2)
                        .let { ListNode(1, next = it) },
                    1,
                    ListNode(1)
                ),
            )
    }
}