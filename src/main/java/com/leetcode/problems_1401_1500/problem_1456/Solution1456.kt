package com.leetcode.problems_1401_1500.problem_1456

class Solution1456 {
    fun maxVowels(s: String, k: Int): Int {
        var currentVowels = 0

        for (i in 0..k - 1) {
            if (vowels.contains(s[i])) currentVowels++
        }
        var bestVowels = currentVowels
        for (i in k..s.length - 1) {
            if (vowels.contains(s[i - k])) currentVowels--
            if (vowels.contains(s[i])) currentVowels++
            bestVowels = maxOf(bestVowels, currentVowels)
        }

        return bestVowels
    }

    companion object {
        private val vowels = setOf('a', 'e', 'i', 'o', 'u')
    }
}