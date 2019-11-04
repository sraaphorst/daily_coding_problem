package dcp.day212
// day212.kt
// By Sebastian Raaphorst, 2019.

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ColumnTester {
    @Test
    // We just make sure that we have a bijection.
    fun columnTest() {
        val upper = 26 * 26 * 26 + 1
         for (colId in 1..upper) {
             println("$colId -> ${columnNumberToId(colId)}, ${columnIdToNum(columnNumberToId(colId))}")
             assertEquals(columnIdToNum(columnNumberToId(colId)), colId)
         }
    }
}