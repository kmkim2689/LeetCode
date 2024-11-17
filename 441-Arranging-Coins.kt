class Solution {
    fun arrangeCoins(n: Int): Int {
        if (n == 1) return 1
        
        var answer = 0
        var currentStep = 1
        var leftOver = n

        while (leftOver > 0) {
            leftOver -= currentStep
            answer++
            currentStep++
            if (leftOver == 0) {
                return answer
            }
        }

        return answer - 1
    }
}

/**
Solution #1.
starting from 1, 2, 3,... sequential order
then compare the value with n
if the sum becomes equal with n, just return n
find the first moment that the sum becomes bigger than the n
return n - 1

Solution #2.
Binary Search
start : 0
end : n
mid : (start + end) / 2
sum = mid(mid - 1) / 2

while (start <= end):
sum == n -> return mid
if (sum < n) : start = mid + 1
if (sum > n) : end = mid - 1

return mid
*/