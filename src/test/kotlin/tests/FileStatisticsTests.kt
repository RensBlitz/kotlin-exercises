// src/test/kotlin/tests/FileStatisticsTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import exercises.FileStatistics
import java.io.File
import java.nio.file.Path

class FileStatisticsTests {
    @Test
    fun basic(@TempDir tmpDir: Path) {
        val tempFile = File.createTempFile("test", ".txt", tmpDir.toFile())
        tempFile.writeText("Hello\nworld\n")
        val (lines, words) = FileStatistics.linesAndWords(tempFile.absolutePath)
        assertEquals(2, lines)
        assertEquals(2, words)
    }
} 