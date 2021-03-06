package dcp.day202
// day202.kt
// By Sebastian Raaphorst, 2019.

import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class UnitTests {
    @Test
    fun palTest() {
        assertEquals(101.isPalindrome(), true)
        assertEquals(1011.isPalindrome(), false)
        assertEquals(111.isPalindrome(), true)
        assertEquals(0.isPalindrome(), true)
        assertEquals(10.isPalindrome(), false)
    }
}

class StringSpecExample : StringSpec() {
    init {
        "Palindrome detection" {
            forAll(100000) { a: Int ->
                // Alternative technique: convert to string, reverse, and compare.
                val isPalindrome = a.toString().reversed() == a.toString()
                a.isPalindrome() == isPalindrome }
        }
    }
}
