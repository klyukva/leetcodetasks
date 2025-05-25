package com.leetcode.problems_101_200.problem_113

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Solution113Test {
    private val solution113 = Solution113()

    @ParameterizedTest
    @MethodSource("arrayProvider")
    fun `examples tree path sum`(root: TreeNode?, targetSum: Int, expected: List<List<Int>>) {
        val result = solution113.pathSum(root, targetSum)
        assertThat(
            result,
            containsInAnyOrder(*expected.toTypedArray())
        )
    }

    companion object {

        @JvmStatic
        private fun arrayProvider() =
            listOf(
                Arguments.of(
                    TreeNode(
                        5,
                        TreeNode(
                            4,
                            TreeNode(
                                11,
                                TreeNode(7),
                                TreeNode(2),
                            )
                        ),
                        TreeNode(
                            8,
                            TreeNode(13),
                            TreeNode(
                                4,
                                TreeNode(5),
                                TreeNode(1),
                            ),
                        )
                    ),
                    22,
                    listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5))
                ),
                Arguments.of(
                    TreeNode(
                        1,
                        TreeNode(
                            2,
                        ),
                        TreeNode(
                            3,
                        )
                    ),
                    5,
                    emptyList<List<Int>>()
                ),
                Arguments.of(
                    TreeNode(
                        1,
                        TreeNode(
                            2,
                        ),
                    ),
                    0,
                    emptyList<List<Int>>()
                ),
                Arguments.of(
                    TreeNode(
                        -2,
                        right = TreeNode(
                            -3,
                        ),
                    ),
                    -5,
                    listOf(listOf(-2, -3))
                ),
                Arguments.of(
                    TreeNode(
                        7,
                        TreeNode(
                            0,
                            TreeNode(
                                -1,
                                TreeNode(
                                    1,
                                    TreeNode(-7)
                                )
                            ),
                            TreeNode(-6)
                        ),
                    ),
                    0,
                    listOf(listOf(7, 0, -1, 1, -7))
                ),
            )
    }
}