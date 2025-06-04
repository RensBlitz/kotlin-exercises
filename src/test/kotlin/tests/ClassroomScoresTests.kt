// src/test/kotlin/tests/ClassroomScoresTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.ClassroomScores

class ClassroomScoresTests {
    @Test
    fun basic() {
        val scores = listOf(80, 90, 100)
        assertEquals(90.0, ClassroomScores.average(scores), 1e-3)
    }
} 