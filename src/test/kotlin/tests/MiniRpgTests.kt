// src/test/kotlin/tests/MiniRpgTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.MiniRpg

class MiniRpgTests {
    @Test
    fun basic() {
        val damages = listOf(10, 20, 30)
        assertEquals(40, MiniRpg.simulateBattle(100, damages))
    }
} 