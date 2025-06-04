// src/test/kotlin/tests/ShoppingBasketTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.ShoppingBasket

class ShoppingBasketTests {
    @Test
    fun basic() {
        val prices = listOf(2.50, 3.00, 4.75)
        assertEquals(10.25, ShoppingBasket.calculateTotal(prices), 1e-3)
    }
} 