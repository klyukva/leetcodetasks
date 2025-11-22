package com.leetcode.problems_601_700.problem_692

import java.util.TreeSet

class Solution692 {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        return words
            .groupingBy { it }
            .eachCount()
            .entries
            .groupBy({ it.value }, { it.key })
            .mapValues { (_, words) -> TreeSet(words) }
            .toSortedMap(reverseOrder())
            .values
            .flatten()
            .take(k)
    }
}