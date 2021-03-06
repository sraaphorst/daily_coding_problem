package dcp.day252
// day252.kt
// By Sebastian Raaphorst, 2019.

import java.math.BigInteger
import kotlin.math.ceil


/**
 * All rational numbers of the form 1/a for a >= 2, generated in order.
 */
var ratsGE2 = sequence {
    var i: BigInteger = 2.toBigInteger()
    while (true) {
        yield(Rational(BigInteger.ONE, i))
        i++
    }
}


fun Rational.toEgyptianRational(): List<Rational> {
    tailrec
    fun aux(r: Rational, iter: Iterator<Rational>, list: List<Rational>): List<Rational>? {
        // If we have reached 0, we are at the end and have our answer.
        if (r == Rational.ZERO)
            return list

        // If the remaining numerator is zero, then we have found the solution and can shortcut.
        val n = if (r.numerator == BigInteger.ONE) r else iter.next()

        // Check if this fits.
        return if (r - n >= Rational.ZERO)
            aux(r - n, iter, list + n)
        else
            aux(r, iter, list)
    }

    return aux(this, ratsGE2.iterator(), emptyList())!!
}

// Imperative so as to guarantee no stack overflow.
fun Rational.toEgyptianRationalImp(): List<Rational> {
    val gen = ratsGE2.iterator()
    val list = mutableListOf<Rational>()
    var curr = this

    while (curr > Rational.ZERO) {
        // If curr is 1/a, we are done.
        if (curr.numerator == BigInteger.ONE)
            return list + curr

        // Otherwise, check if we can remove the next value from curr.
        val n = gen.next()
        if (curr - n >= Rational.ZERO) {
            curr -= n
            list += n
        }
    }

    return list
}

// A more direct way of jumping to the next denominator, but which may fail due to floating point arithmetic (e.g. 493/496)
fun Rational.toEgyptianRationalDirect(): List<Rational>? {
    if (numerator == BigInteger.ZERO) return emptyList()
    val list = mutableListOf<Rational>()
    var curr = this
    while (curr.numerator != BigInteger.ONE) {
        val next = Rational(BigInteger.ONE, ceil(curr.denominator.toDouble() / curr.numerator.toDouble()).toInt().toBigInteger())
        list.add(next)
        curr -= next

        // If this happens, it's because of floating point arithmetic imprecision.
        if (curr < Rational.ZERO)
            return null
    }
    return list + curr
}
