// src/test/kotlin/tests/SpeedUnitSwitcherTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.SpeedUnitSwitcher

class SpeedUnitSwitcherTests {
    @Test
    fun basic() {
        assertEquals(160.934, SpeedUnitSwitcher.milesToKmPerHour(100.0), 1e-3)
    }
} 