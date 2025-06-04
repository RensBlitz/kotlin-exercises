// src/test/kotlin/tests/SimpleDungeonCrawlerTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.SimpleDungeonCrawler

class SimpleDungeonCrawlerTests {
    @Test
    fun basic() {
        val actions = arrayOf("hit", "potion", "hit", "hit")
        assertEquals(4, SimpleDungeonCrawler.simulate(actions))
    }
} 