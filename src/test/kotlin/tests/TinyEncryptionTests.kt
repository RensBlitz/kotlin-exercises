// src/test/kotlin/tests/TinyEncryptionTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.TinyEncryption

class TinyEncryptionTests {
    @Test
    fun basic() {
        // e.g., shift "abc" by 1 → "bcd"
        assertEquals("bcd", TinyEncryption.encrypt("abc", 1))
    }
} 