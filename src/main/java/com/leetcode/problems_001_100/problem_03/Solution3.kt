package com.leetcode.problems_001_100.problem_03

class Solution3 {

    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        var start = 0
        val seenCharLastIndexes = IntArray(128) { -1 } // ASCII size

        for (end in s.indices) {
            val charCode = s[end].code
            if (seenCharLastIndexes[charCode] >= start) {
                start = seenCharLastIndexes[charCode] + 1
            }
            seenCharLastIndexes[charCode] = end
            maxLength = maxOf(maxLength, end - start + 1)
        }

        return maxLength
    }
}