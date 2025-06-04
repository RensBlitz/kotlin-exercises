// src/test/kotlin/tests/SpaceProbeSignalTimeTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.SpaceProbeSignalTime

class SpaceProbeSignalTimeTests {
    @Test
    fun moonDistance() {
        val expected = 768_800.0 / 299_792.0 // ≈2.565 s
        assertEquals(expected, SpaceProbeSignalTime.roundTripSeconds(384_400.0), 1e-4)
    }
} 