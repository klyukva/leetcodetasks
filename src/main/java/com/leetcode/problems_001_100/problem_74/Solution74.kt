package com.leetcode.problems_001_100.problem_74

class Solution74 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        val mSize = matrix.size
        val nSize = matrix[0].size
        val completeSize = mSize * nSize

        var left = 0
        var right = completeSize - 1

        while (left <= right) {
            val current = (right - left) / 2 + left
            val m = current / nSize
            val n = current % nSize
            when  {
                target == matrix[m][n]  -> return true
                target < matrix[m][n] -> right = current - 1
                target > matrix[m][n] -> left = current + 1
            }
        }

        return false
    }
}