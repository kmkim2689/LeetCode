1class Solution {
2    fun containsDuplicate(nums: IntArray): Boolean {
3        val existingNumbers = HashSet<Int>(nums.size)
4        for (num in nums) {
5            if (!existingNumbers.add(num)) {
6                return true
7            }
8        }
9
10        return false
11    }
12}