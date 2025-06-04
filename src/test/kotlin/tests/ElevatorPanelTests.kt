// src/test/kotlin/tests/ElevatorPanelTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import exercises.ElevatorPanel

class ElevatorPanelTests {
    @Test
    fun negative() {
        assertFalse(ElevatorPanel.isValidFloor(-1))
    }

    @Test
    fun ground() {
        assertTrue(ElevatorPanel.isValidFloor(0))
    }

    @Test
    fun tooHigh() {
        assertFalse(ElevatorPanel.isValidFloor(21))
    }
} 