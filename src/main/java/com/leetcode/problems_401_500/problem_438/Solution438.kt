package com.leetcode.problems_401_500.problem_438

class Solution438 {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (p.length > s.length) return emptyList()

        val letterArrayP = IntArray('z' - 'a' + 1) { 0 }
        val letterArrayS = IntArray('z' - 'a' + 1) { 0 }
        val result = mutableListOf<Int>()
        var left = 0

        p.toCharArray().forEach { letterArrayP[it - 'a']++ }

        for (i in 0..p.length - 1) {
            letterArrayS[s[i] - 'a']++
        }
        if (letterArrayP.contentEquals(letterArrayS)) {
            result.add(left)
        }

        for (i in p.length..s.length - 1) {
            letterArrayS[s[left++] - 'a']--
            letterArrayS[s[i] - 'a']++
            if (letterArrayP.contentEquals(letterArrayS)) {
                result.add(left)
            }
        }

        return result
    }
}