// src/test/kotlin/tests/TemperatureSpreadTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.TemperatureSpread

class TemperatureSpreadTests {
    @Test
    fun spreadAndAverage_Basic() {
        val (d, a) = TemperatureSpread.spreadAndAverage(18.0, 10.0)
        assertEquals(8.0, d, 1e-3)
        assertEquals(14.0, a, 1e-3)
    }
} 