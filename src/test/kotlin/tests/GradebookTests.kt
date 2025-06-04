// src/test/kotlin/tests/GradebookTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.Gradebook
import exercises.Student

class GradebookTests {
    @Test
    fun basic() {
        val students = listOf(
            Student("Alice", 85.0),
            Student("Bob", 92.5),
            Student("Carol", 90.0)
        )
        assertEquals("Bob", Gradebook.topStudent(students))
    }
} 