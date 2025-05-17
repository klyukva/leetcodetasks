package com.leetcode.problems_401_500.problem_424

class Solution424 {
    fun characterReplacement(s: String, k: Int): Int {
        val len = s.length
        if (len < 2) return len

        val mapLetterCountInRange = IntArray(26) { 0 }
        var maxLetterCountInRange = 0
        var leftIndex = 0
        var currentRange = 0
        var result = 0

        for (i in 0..len - 1) {
            val currentCode = s[i] - 'A'
            mapLetterCountInRange[currentCode] += 1
            maxLetterCountInRange = maxOf(maxLetterCountInRange, mapLetterCountInRange[currentCode])
            currentRange += 1

            if (currentRange > k + maxLetterCountInRange) {
                val leftCode = s[leftIndex] - 'A'
                mapLetterCountInRange[leftCode] -= 1
                maxLetterCountInRange = maxOf(maxLetterCountInRange)
                leftIndex += 1
                currentRange -= 1
            }

            result = maxOf(currentRange, result)
        }
        return result
    }
}