class Solution {
    fun addDigits(num: Int): Int {
        var number = num
        var sum = 0
        while (number >= 10) {
            sum = 0
            var temp = number
            while (temp != 0) {
                sum += (temp % 10)
                if (temp >= 10) {
                    temp = temp / 10
                } else {
                    break
                }
            }
            number = sum
        }
        return number
    }
}