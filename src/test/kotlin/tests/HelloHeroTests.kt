// src/test/kotlin/tests/HelloHeroTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.HelloHero

class HelloHeroTests {
    @Test
    fun basic() {
        assertEquals("Welcome, Alex!", HelloHero.greet("Alex"))
    }
} 