package com.leetcode.problems_001_100.problem_88

class Solution88 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var mCount = 0
        var nCount = 0
        val result = IntArray(m + n)
        while (mCount < m && nCount < n) {
            if (nums1[mCount] < nums2[nCount]) {
                result[mCount + nCount] = nums1[mCount++]
            } else {
                result[mCount + nCount] = nums2[nCount++]
            }
        }

        while (mCount < m) {
            result[mCount + nCount] = nums1[mCount++]
        }

        while (nCount < n) {
            result[mCount + nCount] = nums2[nCount++]
        }

        for (i in 0..m + n - 1) {
            nums1[i] = result[i]
        }
    }
}