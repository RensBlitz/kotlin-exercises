// src/test/kotlin/tests/PlantWateringScheduleTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import exercises.PlantWateringSchedule

class PlantWateringScheduleTests {
    @Test
    fun mondayTrue() {
        assertTrue(PlantWateringSchedule.shouldWater("Monday"))
    }

    @Test
    fun fridayFalse() {
        assertFalse(PlantWateringSchedule.shouldWater("Friday"))
    }
} 