package com.leetcode.problems_001_100.problem_04

class Solution4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val a = if (nums1.size <= nums2.size) nums1 else nums2
        val b = if (nums1.size > nums2.size) nums1 else nums2

        val m = a.size
        val n = b.size

        var low = 0
        var high = m

        while (low <= high) {
            val partitionA = (low + high) / 2
            val partitionB = (m + n + 1) / 2 - partitionA

            val maxLeftA = if (partitionA == 0) Int.MIN_VALUE else a[partitionA - 1]
            val minRightA = if (partitionA == m) Int.MAX_VALUE else a[partitionA]

            val maxLeftB = if (partitionB == 0) Int.MIN_VALUE else b[partitionB - 1]
            val minRightB = if (partitionB == n) Int.MAX_VALUE else b[partitionB]

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                return if ((m + n) % 2 == 0) {
                    (maxOf(maxLeftA, maxLeftB) + minOf(minRightA, minRightB)) / 2.0
                } else {
                    maxOf(maxLeftA, maxLeftB).toDouble()
                }
            } else if (maxLeftA > minRightB) {
                high = partitionA - 1
            } else {
                low = partitionA + 1
            }
        }

        throw IllegalArgumentException("Input arrays are not sorted or valid.")
    }
}