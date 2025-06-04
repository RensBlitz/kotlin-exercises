// src/test/kotlin/tests/AmusementParkTicketTests.kt
package tests

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import exercises.AmusementParkTicket

class AmusementParkTicketTests {
    @Test
    fun childFree() {
        assertEquals(0.0, AmusementParkTicket.computePrice(10, 25.0))
    }

    @Test
    fun adultPays() {
        assertEquals(25.0, AmusementParkTicket.computePrice(30, 25.0))
    }

    @Test
    fun seniorFree() {
        assertEquals(0.0, AmusementParkTicket.computePrice(70, 25.0))
    }
} 