class Solution {
    fun isPalindrome(s: String): Boolean {
        val result = s.filter { char -> char in 'a'..'z' || char in 'A'..'Z' || char in '0'..'9' }.toLowerCase()
        return result == result.reversed()
    }
}