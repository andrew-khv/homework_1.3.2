import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun calcNotZeroComissionMaestro() {
        val card = "Maestro"
        val lastTransfers = 7500000.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(2375.0, result, 0.0)
    }
    @Test
    fun calcZeroComissionMaestro() {
        val card = "Maestro"
        val lastTransfers = 75000.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(0.0, result, 0.0)
    }
    @Test
    fun calcNotZeroComissionMastercard() {
        val card = "Mastercard"
        val lastTransfers = 7500000.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(2375.0, result, 0.0)
    }
    @Test
    fun calcZeroComissionMastercard() {
        val card = "Mastercard"
        val lastTransfers = 0.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(0.0, result, 0.0)
    }
    @Test
    fun calcNotZeroComissionVisa() {
        val card = "Visa"
        val lastTransfers = 0.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(375.0, result, 0.0)
    }
    @Test
    fun calcNotZeroComissionMir() {
        val card = "Mir"
        val lastTransfers = 0.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(375.0, result, 0.0)
    }
    @Test
    fun calcZeroComissionVK() {
        val card = "VK"
        val lastTransfers = 0.0
        val transfer = 50000.0

        val result = calComission(card, lastTransfers, transfer)

        assertEquals(0.0, result, 0.0)
    }
}