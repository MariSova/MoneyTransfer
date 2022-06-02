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
}