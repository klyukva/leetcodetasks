package com.leetcode.problems_301_400.problem_349

class Solution349 {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersectionArray = IntArray(1001)
        for (i in nums1) {
            intersectionArray[i] = 1
        }

        var resultIdentifier = 0
        for (i in nums2) {
            if (intersectionArray[i] > 0) {
                nums1[resultIdentifier++] = i
                intersectionArray[i] = 0
            }
        }
        return nums1.copyOf(resultIdentifier)
    }
}