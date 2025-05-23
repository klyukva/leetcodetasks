package com.leetcode.problems_101_200.problem_151

class Solution151 {
    fun reverseWords(s: String): String {
        val result = StringBuilder()
        var left = s.length - 1

        while (left >= 0) {
            while (left >= 0 && s[left] == ' ') {
                left--
            }

            if (left < 0) {
                break
            }
            val right = left
            while (left >= 0 && s[left] != ' ') {
                left--
            }

            result.append(s.substring(left + 1, right + 1))
            result.append(' ')
        }

        result.setLength(result.length - 1)
        return result.toString()
    }
}