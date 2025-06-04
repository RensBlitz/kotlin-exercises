// src/test/kotlin/tests/VatCalculatorTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.VatCalculator

class VatCalculatorTests {
    @Test
    fun basic() {
        assertEquals(120.0, VatCalculator.addVat(100.0, 20.0), 1e-3)
    }
} 