package ru.netology

const val ACCOUNT_TYPE_MASTER = "MasterCard, Maestro"
const val ACCOUNT_TYPE_VISA = "Visa, Мир"
const val ACCOUNT_TYPE_VK_PAY = "VK Pay"

fun main() {
    val transferAmount: Int
    val previousTransfer: Int
    commissionCalculate(54222, 0, "Visa, Мир")

}

fun commissionCalculate(transferAmount: Int, previousTransfer: Int, ACCOUNT_TYPE_VK_PAY: String) {

    val userType = ACCOUNT_TYPE_VK_PAY
    val commission = when (userType) {
        ACCOUNT_TYPE_VK_PAY -> {
            when {
                ((transferAmount + previousTransfer) >= 40_000) -> println("Превышена сумма месячного перевода средств")
                (transferAmount >= 15_000) -> println("Превышена сумма перевода за одну транзакцию")
                else -> 0
            }
        }
        ACCOUNT_TYPE_VISA -> {
            when {
                ((transferAmount + previousTransfer) >= 150_000) -> println("Превышена сумма перевода в сутки")
                ((transferAmount + previousTransfer) >= 600_000) -> println("Превышена сумма перевода в месяц")
                else -> {
                    val minCommission = 3_500
                    val calculate = (transferAmount * 0.0075 * 100).toInt()
                    if (calculate < minCommission) minCommission else calculate
                }
            }
        }
        ACCOUNT_TYPE_MASTER -> {
            when {
                ((transferAmount + previousTransfer) >= 600_000) -> println("Превышена сумма перевода в месяц")
                ((transferAmount + previousTransfer) >= 150_000) -> println("Превышена сумма перевода в сутки")
                transferAmount < 75_000 -> 0
                transferAmount in 75_000..150_000 -> ((transferAmount * 0.006 * 100) + 2_000).toInt()
                else -> error("Введено не верное значение")
            }
        }
        else -> error("Неподдерживаемый тип платежной системы")
    }
    println("Комиссия составляет $commission копеек")
}