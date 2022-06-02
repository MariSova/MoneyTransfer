package ru.netology

fun calculateCommission(
    userCard: String = "Vk Pay",
    transferAmountMonth: Int = 0,
    transferAmountUser: Int,
): Int {
    val amount = transferAmountUser * 100
    val commission: Int =
            if (transferAmountMonth <= 600_000 && userCard == "MasterCard, Maestro" || userCard == "Vk Pay" && transferAmountMonth <= 40_000) 0
            else (amount / 100 * 0.75).toInt()
    return (commission)
    //println("$commission")

}

fun main() {
    var result = calculateCommission(userCard = "Visa", transferAmountUser = 5000)

    println("Коммиссия $result копеек")

}

/*fun main() {
    var transferRub = 10000
    val amount = transferRub * 100
    val commission: Int = (amount / 100 * 0.75).toInt()
    val result = if (commission <= 3500) 3500 else commission
    println("Total commission = $result kopecks")

} */