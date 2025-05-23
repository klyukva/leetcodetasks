package com.leetcode.problems_1601_1700.problem_1653

class Solution1653 {
    fun minimumDeletions(s: String): Int {
        var result = 0
        var countB = 0
        for (c in s.toCharArray()) {
            if (c == 'b') {
                countB++
            } else if (countB != 0) {
                result++
                countB--
            }
        }
        return result
    }
}