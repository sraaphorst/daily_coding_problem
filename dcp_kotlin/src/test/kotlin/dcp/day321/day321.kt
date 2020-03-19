package dcp.day321

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UnitTests {
    @Test
    @kotlin.ExperimentalUnsignedTypes
    fun example1() {
        assertEquals((1 until 1000).map(Int::toULong).map(ULong::stepToZero),
            listOf(0, 1, 2, 2, 3, 3, 4, 3, 3, 4, 5, 3, 4, 5, 4, 3, 4, 4, 5, 4, 5, 6, 7, 4, 4, 5, 4, 5, 6, 4, 5, 4, 5, 5,
                5, 4, 5, 6, 5, 4, 5, 5, 6, 6, 4, 5, 6, 4, 5, 5, 5, 5, 6, 4, 5, 4, 5, 6, 7, 4, 5, 6, 4, 4, 5, 6, 7, 5, 6,
                5, 6, 4, 5, 6, 5, 6, 6, 5, 6, 4, 4, 5, 6, 4, 5, 6, 7, 6, 7, 5, 5, 6, 6, 7, 6, 4, 5, 6, 6, 5, 6, 5, 6, 5,
                5, 6, 7, 4, 5, 6, 6, 4, 5, 6, 7, 7, 5, 6, 5, 4, 5, 6, 6, 6, 5, 5, 6, 4, 5, 5, 6, 4, 5, 6, 5, 5, 6, 6, 7,
                5, 6, 7, 5, 4, 5, 6, 6, 6, 7, 5, 6, 6, 5, 6, 6, 5, 6, 7, 7, 4, 5, 5, 6, 6, 5, 6, 7, 5, 5, 5, 6, 7, 8, 7,
                5, 4, 5, 6, 7, 5, 6, 6, 6, 6, 6, 6, 5, 6, 5, 6, 7, 4, 5, 6, 5, 6, 7, 5, 6, 5, 6, 7, 7, 5, 6, 7, 7, 4, 5,
                5, 6, 7, 7, 8, 7, 5, 6, 6, 6, 5, 5, 6, 7, 4, 5, 6, 7, 6, 7, 6, 6, 7, 8, 5, 6, 7, 7, 5, 6, 4, 5, 6, 5, 6,
                6, 6, 6, 6, 7, 5, 6, 5, 6, 7, 5, 4, 5, 6, 6, 5, 6, 7, 8, 5, 6, 6, 7, 7, 8, 5, 6, 5, 6, 7, 5, 6, 7, 8, 6,
                5, 6, 7, 8, 7, 6, 6, 6, 5, 5, 6, 6, 6, 7, 6, 7, 6, 5, 6, 7, 5, 6, 7, 7, 6, 6, 5, 6, 6, 7, 6, 7, 5, 6, 7,
                5, 6, 7, 7, 7, 5, 6, 6, 6, 5, 5, 6, 6, 6, 7, 5, 6, 7, 6, 7, 8, 5, 6, 6, 6, 5, 6, 6, 6, 7, 7, 8, 9, 7, 8,
                5, 5, 5, 6, 6, 7, 7, 6, 7, 8, 5, 6, 7, 6, 6, 6, 6, 7, 6, 6, 6, 7, 6, 7, 6, 5, 6, 7, 5, 6, 5, 6, 7, 8, 5,
                6, 6, 6, 6, 7, 5, 6, 5, 6, 7, 7, 5, 6, 7, 6, 5, 6, 7, 6, 7, 5, 6, 6, 5, 6, 6, 7, 7, 8, 6, 7, 5, 6, 6, 7,
                5, 6, 7, 7, 7, 5, 6, 6, 7, 6, 7, 8, 5, 6, 6, 6, 6, 7, 6, 7, 5, 5, 6, 7, 6, 7, 8, 8, 5, 6, 5, 6, 6, 7, 8,
                6, 5, 6, 7, 5, 6, 7, 6, 7, 7, 6, 7, 8, 5, 6, 7, 7, 7, 7, 7, 5, 6, 7, 7, 8, 5, 6, 6, 6, 6, 6, 5, 6, 6, 7,
                6, 7, 6, 7, 6, 5, 6, 7, 7, 8, 5, 6, 7, 8, 5, 6, 6, 6, 7, 8, 5, 6, 5, 5, 6, 7, 6, 7, 6, 7, 5, 6, 7, 8, 7,
                5, 6, 6, 5, 6, 7, 6, 6, 6, 7, 8, 7, 8, 9, 6, 5, 6, 7, 7, 5, 6, 6, 7, 7, 6, 5, 6, 5, 6, 7, 6, 7, 8, 6, 7,
                5, 6, 7, 8, 7, 6, 7, 5, 6, 7, 5, 6, 6, 7, 6, 5, 5, 6, 6, 6, 6, 7, 6, 7, 6, 5, 6, 7, 5, 6, 7, 8, 6, 7, 5,
                6, 7, 7, 6, 7, 5, 6, 7, 7, 7, 6, 7, 8, 5, 6, 6, 7, 5, 6, 7, 6, 5, 6, 7, 8, 6, 5, 6, 7, 5, 5, 6, 6, 7, 6,
                5, 6, 7, 7, 8, 7, 7, 6, 7, 7, 5, 6, 7, 8, 6, 6, 6, 7, 5, 6, 6, 6, 7, 8, 6, 7, 6, 6, 7, 8, 5, 6, 7, 6, 7,
                6, 6, 7, 8, 8, 7, 6, 5, 6, 7, 5, 6, 7, 6, 6, 5, 6, 6, 7, 5, 6, 6, 7, 7, 7, 5, 6, 7, 5, 6, 7, 7, 6, 7, 8,
                6, 7, 5, 6, 5, 6, 7, 7, 6, 7, 7, 7, 7, 6, 6, 6, 7, 7, 8, 9, 5, 6, 7, 6, 7, 6, 6, 7, 5, 5, 6, 7, 6, 7, 8,
                6, 5, 6, 6, 7, 6, 6, 7, 8, 6, 7, 8, 7, 6, 7, 5, 6, 7, 7, 7, 7, 5, 6, 7, 6, 5, 6, 7, 6, 7, 5, 6, 7, 5, 6,
                6, 6, 6, 7, 6, 6, 6, 6, 7, 6, 5, 6, 6, 7, 5, 6, 7, 8, 8, 9, 7, 6, 5, 6, 7, 7, 7, 8, 6, 7, 5, 6, 7, 6, 7,
                6, 6, 7, 7, 8, 5, 6, 7, 7, 6, 7, 5, 6, 7, 5, 6, 7, 7, 8, 7, 6, 7, 8, 5, 6, 7, 8, 5, 6, 7, 8, 6, 6, 7, 8,
                5, 6, 7, 7, 7, 6, 7, 6, 7, 8, 6, 6, 7, 8, 6, 5, 6, 7, 6, 7, 7, 6, 7, 8, 5, 6, 7, 6, 6, 7, 5, 6, 6, 6, 6,
                6, 6, 7, 8, 8, 5, 6, 5, 6, 6, 6, 7, 8, 6, 7, 7, 5, 6, 7, 7, 8, 5, 6, 7, 6, 5, 6, 6, 6, 6, 7, 7, 8, 8, 7,
                6, 7, 5, 6, 7, 6, 7, 7, 5, 6, 5, 6, 7, 7, 5, 6, 7, 7, 5, 6, 6, 6, 7, 8, 9, 6, 5, 6, 7, 7, 7, 8, 7, 6, 7,
                5, 6, 7, 7, 6, 6, 7, 5, 6, 7, 8, 7, 6, 7, 7, 5, 6, 6, 7, 6, 6, 6, 7, 6, 6, 6, 7, 5, 6, 7, 6, 6, 7, 7, 8,
                6, 6, 7, 8, 6, 7, 6, 7, 6, 7, 5, 6, 5, 6, 7, 7, 7, 8, 9, 6).map(Int::toULong))
    }
}