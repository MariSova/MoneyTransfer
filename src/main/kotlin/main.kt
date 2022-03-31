package ru.netology

/**
 *
 */
fun main() {
    var transferRub = 10000
    val amount = transferRub * 100
    val commission: Int = (amount / 100 * 0.75).toInt()
    val result = if (commission <= 3500) 3500 else commission
    println("Total commission = $result kopecks")

}

