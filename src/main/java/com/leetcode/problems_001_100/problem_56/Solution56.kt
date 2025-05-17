package com.leetcode.problems_001_100.problem_56

class Solution56 {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val size = intervals.size
        if (size < 2) return intervals

        intervals.sortBy { it[0] }

        var resultIterator = 0
        for (i in 1..size - 1) {
            if (intervals[resultIterator][1] >= intervals[i][0]) {
                intervals[resultIterator] = intArrayOf(
                    intervals[resultIterator][0], maxOf(intervals[resultIterator][1], intervals[i][1])
                )
            } else {
                intervals[++resultIterator] = intervals[i]
            }
        }

        return intervals.copyOfRange(0, resultIterator + 1)

    }
}