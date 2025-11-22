package com.leetcode.problems_401_500.problem_438

class Solution438v2 {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (p.length > s.length) return emptyList()

        val letterArrayP = IntArray('z' - 'a' + 1) { 0 }
        val result = mutableListOf<Int>()

        p.toCharArray().forEach { letterArrayP[it - 'a']++ }

        for (i in 0..<s.length) {
            letterArrayP[s[i] - 'a']--
            if (i - p.length >= 0) {
                letterArrayP[s[i - p.length] - 'a']++
            }
            if (i - p.length + 1 >= 0 && letterArrayP.all { it == 0 }) {
                result.add(i - p.length + 1)
            }
        }

        return result
    }
}