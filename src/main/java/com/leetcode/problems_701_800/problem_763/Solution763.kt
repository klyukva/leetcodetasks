package com.leetcode.problems_701_800.problem_763

class Solution763 {
    fun partitionLabels(s: String): List<Int> {

        val lastLetterOccurrence = IntArray(26) { -1 }
        for (i in s.indices) {
            lastLetterOccurrence[s[i] - 'a'] = i
        }
        val resultLenList = mutableListOf<Int>()
        var currentSize = 0
        var currentRightPointer = -1
        for (i in s.indices) {
            val rightPointer = lastLetterOccurrence[s[i] - 'a']
            when {
                rightPointer >= currentRightPointer && rightPointer == i -> {
                    resultLenList.add(currentSize + 1)
                    currentSize = 0
                }
                rightPointer > currentRightPointer -> {
                    currentRightPointer = rightPointer
                    currentSize++
                }
                else -> {
                    currentSize++
                }
            }

        }
        return resultLenList
    }
}