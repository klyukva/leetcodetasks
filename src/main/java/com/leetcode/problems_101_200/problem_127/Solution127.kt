package com.leetcode.problems_101_200.problem_127

class Solution127 {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        if (endWord !in wordList) return 0

        val patterns = mutableMapOf<String, MutableList<String>>()
        val visited = mutableSetOf<String>()
        val queue = ArrayDeque<String>()
        queue.addLast(beginWord)
        visited.add(beginWord)
        var steps = 1

        // include beginWord in pattern map, just like Python logic
        wordList.forEach { word ->
            for (i in word.indices) {
                val pattern = word.substring(0, i) + "*" + word.substring(i + 1)
                patterns.computeIfAbsent(pattern) { mutableListOf() }.add(word)
            }
        }

        while (queue.isNotEmpty()) {
            repeat(queue.size) {
                val word = queue.removeFirst()
                if (word == endWord) return steps

                for (i in word.indices) {
                    val pattern = word.substring(0, i) + "*" + word.substring(i + 1)
                    for (next in patterns[pattern].orEmpty()) {
                        if (next !in visited) {
                            visited.add(next)
                            queue.addLast(next)
                        }
                    }
                }
            }
            steps++
        }

        return 0
    }

}