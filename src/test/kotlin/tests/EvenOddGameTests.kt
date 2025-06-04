// src/test/kotlin/tests/EvenOddGameTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.EvenOddGame

class EvenOddGameTests {
    @Test
    fun even() {
        assertEquals("wizard", EvenOddGame.classify(4))
    }

    @Test
    fun odd() {
        assertEquals("orc", EvenOddGame.classify(7))
    }
} 