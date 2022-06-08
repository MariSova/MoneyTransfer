import org.junit.Test

import org.junit.Assert.*
import ru.netology.calculateCommission

class MainKtTest {

    @Test
    fun calculateCommission() {
        val card = "Vk Pay"
        val month = 0
        val transfer = 10000

        val result = calculateCommission(
            userCard = card,
            transferAmountMonth = month,
            transferAmountUser = transfer
        )

        assertEquals(0, result)

    }

    @Test
    fun calculateCommissionVisa() {
        val card = "Visa"
        val month = 390
        val transfer = 32000

        val result = calculateCommission(
            userCard = card,
            transferAmountMonth = month,
            transferAmountUser = transfer
        )

        assertEquals(24000, result)

    }

    @Test
    fun calculateCommissionMaster() {
        val card = "MasterCard, Maestro"
        val month = 790
        val transfer = 100

        val result = calculateCommission(
            userCard = card,
            transferAmountMonth = month,
            transferAmountUser = transfer
        )

        assertEquals(0, result)

    }

}