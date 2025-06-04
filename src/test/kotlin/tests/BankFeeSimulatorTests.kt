// src/test/kotlin/tests/BankFeeSimulatorTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.BankFeeSimulator

class BankFeeSimulatorTests {
    @Test
    fun basic() {
        // e.g., initial=100.0, transactions=12:
        // fee = 0.5 × 12 + 0.3 × 2 = 6 + 0.6 = 6.6 → final = 93.4
        assertEquals(93.4, BankFeeSimulator.simulateTransactions(100.0, 12), 1e-3)
    }
} 