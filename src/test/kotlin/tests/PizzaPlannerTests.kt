// src/test/kotlin/tests/PizzaPlannerTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.PizzaPlanner

class PizzaPlannerTests {
    @Test
    fun basic() {
        // e.g., if slicesPerPizza=8 and guests=10, need 2 pizzas
        assertEquals(2, PizzaPlanner.pizzasNeeded(10, 8))
    }
} 