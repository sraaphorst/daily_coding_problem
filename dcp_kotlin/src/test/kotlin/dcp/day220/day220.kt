package dcp.day220
// day220.kt
// By Sebastian Raaphorst, 2019.

import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec
import kotlin.math.min

class CoinGameTester : StringSpec() {
    init {
        "Coin game tester" {
            forAll(50, Gen.list(Gen.choose(1, 100))) { coins: List<Int> ->
                val coinLimit = coins.take(min(coins.size, 20))
                coin_backtrack(coinLimit) == coin_dynamic(coinLimit)
            }
        }
    }
}
