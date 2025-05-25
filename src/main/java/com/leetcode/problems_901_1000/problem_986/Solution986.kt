package com.leetcode.problems_901_1000.problem_986

class Solution986 {
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val sizeFirst = firstList.size
        val sizeSecond = secondList.size

        if (sizeFirst == 0 || sizeSecond == 0) return emptyArray()

        val result = mutableListOf<IntArray>()

        var l = 0
        var r = 0

        while (l < sizeFirst && r < sizeSecond) {
            if (firstList[l][1] < secondList[r][0]) {
                l++
                continue
            }
            if (secondList[r][1] < firstList[l][0]) {
                r++
                continue
            }
            result.add(intArrayOf(
                maxOf(firstList[l][0], secondList[r][0]),
                minOf(firstList[l][1], secondList[r][1]),
            ))
            if (secondList[r][1] > firstList[l][1]) {
                l++
            } else if (secondList[r][1] < firstList[l][1]) {
                r++
            } else {
                l++
                r++
            }
        }

        return result.toTypedArray()
    }
}