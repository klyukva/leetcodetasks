package com.leetcode.problems_001_100.problem_49

class Solution49 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val size = strs.size
        if (size < 2) return listOf(strs.toList())

        val mapAnagrams = mutableMapOf<String, MutableList<Int>>()

        for (i in 0..size - 1) {
            mapAnagrams.compute(strs[i].toCharArray().sorted().joinToString("")) { k, v ->
                v?.let {
                    it.add(i)
                    it
                } ?: mutableListOf(i)
            }
        }

        return mapAnagrams.values.map { it.map { i -> strs[i] } }
    }
}