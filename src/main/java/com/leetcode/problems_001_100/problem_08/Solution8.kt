package com.leetcode.problems_001_100.problem_08

class Solution8 {
    fun myAtoi(s: String): Int {
        var result = 0
        var sign = 1
        val size = s.length
        var i = 0
        while (i < size && s[i] == ' ') {
            i++
        }
        if (i < size && s[i] == '-') {
            sign = -1
            i++
        } else if (i < size && s[i] == '+') {
            i++
        }
        while (i < size && s[i].isDigit()) {
            val digit = s[i] - '0'
            if (result > Int.MAX_VALUE / 10 || result == Int.MAX_VALUE / 10 && digit > Int.MAX_VALUE % 10) {
                return if (sign == -1) Int.MIN_VALUE else Int.MAX_VALUE
            }
            result = result * 10 + digit
            i++
        }

        return result * sign
    }
}