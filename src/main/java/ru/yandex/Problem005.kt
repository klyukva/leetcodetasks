package ru.yandex

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()

    val nValues = IntArray(n) { reader.readLine().toInt() }

    val DEFAULT_VALUE = Int.MAX_VALUE

    val daysOnRemCoup = Array(n + 1) { IntArray(n + 1) { DEFAULT_VALUE } }

    daysOnRemCoup[0][0] = 0

    var totalCoupons = 0
    for (i in 1..n) {
        val todayCost = nValues[i - 1]
        if (todayCost > 100) totalCoupons++
        for (j in 0..totalCoupons) {
            if (todayCost <= 100) {
                val spendCoupon = if (j < totalCoupons && daysOnRemCoup[i - 1][j + 1] != DEFAULT_VALUE) {
                    daysOnRemCoup[i - 1][j + 1]
                } else DEFAULT_VALUE
                val addToday = if (daysOnRemCoup[i - 1][j] != DEFAULT_VALUE) {
                    daysOnRemCoup[i - 1][j] + todayCost
                } else DEFAULT_VALUE
                daysOnRemCoup[i][j] = minOf(spendCoupon, addToday)
            } else {
                val spendCoupon = if (j < totalCoupons && daysOnRemCoup[i - 1][j + 1] != DEFAULT_VALUE) {
                    daysOnRemCoup[i - 1][j + 1]
                } else DEFAULT_VALUE
                val addToday = if (j > 0 && daysOnRemCoup[i - 1][j - 1] != DEFAULT_VALUE) {
                    daysOnRemCoup[i - 1][j - 1] + todayCost
                } else DEFAULT_VALUE
                daysOnRemCoup[i][j] = minOf(spendCoupon, addToday)
            }
        }
    }

    var minCost = DEFAULT_VALUE
    var bestK1 = 0

    for (j in 0..n) {
        if (daysOnRemCoup[n][j] < minCost) {
            minCost = daysOnRemCoup[n][j]
            bestK1 = j
        } else if (daysOnRemCoup[n][j] == minCost && j > bestK1) {
            bestK1 = j
        }
    }

    var currentJ = bestK1
    val queueK2 = ArrayDeque<Int>()

    for (i in n downTo 1) {
        if (currentJ < n && nValues[i - 1] != 0 && daysOnRemCoup[i][currentJ] == daysOnRemCoup[i - 1][currentJ + 1]) {
            queueK2.addFirst(i)
            currentJ++
        } else if (nValues[i - 1] > 100) {
            currentJ--
        }
    }

    writer.write("$minCost\n")
    writer.write("$bestK1 ${queueK2.size}\n")
    queueK2.joinToString("\n").let { writer.write(it) }

    reader.close()
    writer.close()
}