// src/test/kotlin/tests/CafeTipJarTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.CafeTipJar

class CafeTipJarTests {
    @Test
    fun totalWithTip_Standard() {
        assertEquals(20.16, CafeTipJar.totalWithTip(18.0, 12.0), 1e-3)
    }
} 