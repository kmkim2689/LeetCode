class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var minPrice = prices.first()
        for (price in prices) {
            if (minPrice > price) minPrice = price
            if (price - minPrice > max) max = price - minPrice
        }

        return max
    }
}