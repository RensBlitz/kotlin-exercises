// src/test/kotlin/tests/MoonWeightConverterTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.MoonWeightConverter

class MoonWeightConverterTests {
    @Test
    fun toMoonWeight_SixtyKg() {
        assertEquals(9.9, MoonWeightConverter.toMoonWeight(60.0), 1e-3)
    }
} 