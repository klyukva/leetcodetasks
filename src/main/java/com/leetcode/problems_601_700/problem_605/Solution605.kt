package com.leetcode.problems_601_700.problem_605

class Solution605 {

    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var current = 0
        var varN = n
        val size = flowerbed.size
        while (varN != 0) {
            if (current >= size) {
                break
            }
            when {
                (
                        current - 1 == -1 || flowerbed[current - 1] == 0)
                        && flowerbed[current] == 0
                        && (current + 1 == size || flowerbed[current + 1] == 0
                ) -> {
                    varN--
                    flowerbed[current] = 1
                    current += 2
                }
                flowerbed[current] == 0 -> current += 1
                else -> current += 2
            }
        }

        return varN == 0
    }
}