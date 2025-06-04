// src/test/kotlin/tests/FizzBuzzLiteTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.FizzBuzzLite

class FizzBuzzLiteTests {
    @Test
    fun sequence() {
        val seq = FizzBuzzLite.generate()
        assertEquals(20, seq.size)
        assertEquals("Fizz", seq[2])
        assertEquals("4", seq[3])
        assertEquals("Fizz", seq[5])
    }
} 