class Solution {
    fun addBinary(a: String, b: String): String {
        var carry = 0
        val aLength = a.length
        val bLength = b.length
        val maxLength = max(aLength, bLength)

        var number1 = a.map { numChar -> 
            numChar.digitToInt() 
        }
        var number2 = b.map { numChar ->
            numChar.digitToInt()
        }

        var answer = IntArray(maxLength) { 0 }

        if (aLength > bLength) {
            val difference = aLength - bLength
            number2 = List(difference) { 0 } + number2
        } else if (aLength < bLength) {
            val difference = bLength - aLength
            number1 = List(difference) { 0 } + number1
        }

        for (index in maxLength - 1 downTo 0) {
            val sum = number1[index] + number2[index] + carry
            if (sum >= 2) {
                carry = 1
                answer[index] = sum - 2
            } else {
                carry = 0
                answer[index] = sum
            }
        }

        if (carry == 1) {
            answer = intArrayOf(1) + answer
        }

        return answer.joinToString("")
    }
}