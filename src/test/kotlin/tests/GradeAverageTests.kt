// src/test/kotlin/tests/GradeAverageTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.GradeAverage

class GradeAverageTests {
    @Test
    fun basic() {
        assertEquals(7.0, GradeAverage.average(5.0, 7.0, 9.0), 1e-3)
    }
} 