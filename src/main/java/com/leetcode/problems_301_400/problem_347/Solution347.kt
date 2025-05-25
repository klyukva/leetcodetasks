package com.leetcode.problems_301_400.problem_347

import java.util.PriorityQueue

class Solution347 {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val mapArray = Array(20001) { 0 }

        for (i in nums) {
            mapArray[i + 10000] += 1
        }

        val pq = PriorityQueue<Pair<Int, Int>> { a, b -> a.first - b.first }

        for (i in mapArray.indices) {
            if (mapArray[i] > 0)
                pq.add(Pair(mapArray[i], i - 10000))
            if (pq.size > k)
                pq.poll()
        }

        return pq.map { it.second }.toIntArray()
    }
}