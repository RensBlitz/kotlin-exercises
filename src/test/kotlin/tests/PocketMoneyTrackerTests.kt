package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.PocketMoneyTracker

class PocketMoneyTrackerTests {
    @Test
    fun calculateTotal_Returns8() {
        assertEquals(8, PocketMoneyTracker.calculateTotal(5, 3))
    }
} 