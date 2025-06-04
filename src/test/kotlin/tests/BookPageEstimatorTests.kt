// src/test/kotlin/tests/BookPageEstimatorTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.BookPageEstimator

class BookPageEstimatorTests {
    @Test
    fun estimate_40pph_90min() {
        assertEquals(60.0, BookPageEstimator.estimatePages(40, 90), 1e-3)
    }
} 