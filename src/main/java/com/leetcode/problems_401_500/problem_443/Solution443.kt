package com.leetcode.problems_401_500.problem_443

class Solution443 {
    fun compress(chars: CharArray): Int {

        var prevSymbol: Char? = null
        var symbolCount = 0
        var index = -1

        for (i in chars.indices) {
            if (prevSymbol != chars[i]) {
                index = addNumbers(index, symbolCount, chars)
                prevSymbol = chars[i]
                index++
                chars[index] = prevSymbol
                symbolCount = 1
            } else {
                symbolCount++
            }
        }

        index = addNumbers(index, symbolCount, chars)

        return index + 1
    }

    private fun addNumbers(index: Int, symbolCount: Int, chars: CharArray): Int {
        var varIndex = index
        if (symbolCount >= 1000) {
            varIndex++
            chars[varIndex] = '0' + (symbolCount % 10000) / 1000
        }
        if (symbolCount >= 100) {
            varIndex++
            chars[varIndex] = '0' + (symbolCount % 1000) / 100
        }
        if (symbolCount >= 10) {
            varIndex++
            chars[varIndex] = '0' + (symbolCount % 100) / 10
        }
        if (symbolCount > 1) {
            varIndex++
            chars[varIndex] = '0' + symbolCount % 10
        }

        return varIndex
    }
}