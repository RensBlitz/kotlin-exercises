// src/test/kotlin/tests/FantasyPotionMixTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import exercises.FantasyPotionMix

class FantasyPotionMixTests {
    @Test
    fun volumes_750() {
        assertArrayEquals(intArrayOf(225, 375, 150), FantasyPotionMix.ingredientVolumes(750))
    }
} 