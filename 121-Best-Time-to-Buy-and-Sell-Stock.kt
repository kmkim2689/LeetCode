class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var minPrice = prices.first()
        for (price in prices) {
            val diff = price - minPrice
            if (minPrice > price) minPrice = price
            if (diff > max) max = diff
        }

        return max
    }
}