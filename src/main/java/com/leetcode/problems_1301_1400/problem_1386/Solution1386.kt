package com.leetcode.problems_1301_1400.problem_1386

class Solution1386 {
    fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int {
        val mapReserved = mutableMapOf<Int, IntArray>()
        var result = n * 2

        for (i in reservedSeats) {
            if (i[1] in 2..9) {
                mapReserved.getOrPut(i[0]){ IntArray(4) { 0 } }[i[1] / 2 - 1] = 1
            }
        }

        for (v in mapReserved.values) {
            result -= when {
                v.size == 1 || v[0] == 0 && v[1] == 0 || v[1] == 0 && v[2] == 0 || v[2] == 0 && v[3] == 0  -> 1
                else -> 2
            }
        }

        return result
    }
}