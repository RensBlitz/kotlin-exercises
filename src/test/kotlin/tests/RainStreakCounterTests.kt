// src/test/kotlin/tests/RainStreakCounterTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.RainStreakCounter

class RainStreakCounterTests {
    @Test
    fun sampleWeek() {
        val week = booleanArrayOf(true, true, false, true, true, true, false)
        assertEquals(3, RainStreakCounter.longestStreak(week))
    }
} 