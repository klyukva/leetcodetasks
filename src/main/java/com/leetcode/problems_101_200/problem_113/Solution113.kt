package com.leetcode.problems_101_200.problem_113

class Solution113 {
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        if (root == null) return emptyList()

        var currentSum = 0
        val stack = ArrayList<TreeNode>()
        val resultTreeList = ArrayList<TreeNode>()
        val result = mutableListOf<List<Int>>()
        stack.add(root)

        while(stack.isNotEmpty()) {
            val currentNode = stack.removeLast()
            while (resultTreeList.isNotEmpty()
                && resultTreeList.last().left !== currentNode
                && resultTreeList.last().right !== currentNode) {
                currentSum -= resultTreeList.removeLast().`val`
            }
            resultTreeList.add(currentNode)
            currentSum += currentNode.`val`

            if (currentSum == targetSum && currentNode.left == null && currentNode.right == null) {
                result.add(resultTreeList.map { it.`val` })
            }

            currentNode.left?.let { stack.add(it) }
            currentNode.right?.let { stack.add(it) }

        }

        return result
    }
}