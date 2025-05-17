package com.leetcode.problems_001_100.problem_05

class Solution5 {
    var left: Int = 0
    var maxLen: Int = 0

    fun longestPalindrome(s: String): String {
        val len = s.length

        if (len < 2) return s

        for (i in 0..len - 2) {
            if (len - i <= maxLen / 2) break
            extendPalindrome(s, i, i + 1)
            extendPalindrome(s, i, i + 2)
        }
        return s.substring(left, left + maxLen)
    }

    fun extendPalindrome(input: String, start: Int, finish: Int) {
        var l = start
        var r = finish

        while (l >= 0 && r < input.length && input[l] == input[r]) {
            l--
            r++
        }

        if (maxLen < r - l - 1) {
            left = l + 1
            maxLen = r - l - 1
        }
    }

}