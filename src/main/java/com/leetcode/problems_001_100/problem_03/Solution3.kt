package com.leetcode.problems_001_100.problem_03

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        var start = 0
        val seenChars = IntArray(128) { -1 } // ASCII size

        for (end in s.indices) {
            val index = s[end].code
            if (seenChars[index] >= start) {
                start = seenChars[index] + 1
            }
            seenChars[index] = end
            maxLength = maxOf(maxLength, end - start + 1)
        }

        return maxLength
    }
}