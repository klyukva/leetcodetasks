package com.leetcode.problems_801_900.problem_848

class Solution848 {
    fun shiftingLetters(s: String, shifts: IntArray): String {
        for (i in shifts.size - 1 downTo 1) {
            shifts[i-1] = (shifts[i-1] + shifts[i]) % LETTER_COUNT
        }

        val resultBuilder = StringBuilder(s.length)
        for (i in s.indices) {
            resultBuilder.append(Char((s[i].code - FIRST_LETTER_CODE + shifts[i]) % LETTER_COUNT + FIRST_LETTER_CODE))
        }
        return resultBuilder.toString()
    }

    companion object {
        const val LETTER_COUNT = 26
        const val FIRST_LETTER_CODE = 'a'.code
    }
}