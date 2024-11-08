class Solution {
    fun climbStairs(n: Int): Int {
        val dp = IntArray(n + 1) { 0 }
        dp[1] = 1
        if (n >= 2) dp[2] = 2
        for (step in 3..n) {
            dp[step] = dp[step - 1] + dp[step - 2]
        }
        
        return dp[n]
    }
}