class Solution {
    fun majorityElement(nums: IntArray): Int {
        var max = 1
        var num = nums[0]
        val map = mutableMapOf<Int, Int>()
        for (number in nums) {
            map[number] = map.getOrDefault(number, 0) + 1
            val cnt = map.getOrDefault(number, 0)
            if (cnt > max) {
                max = cnt
                num = number
            }
        }

        return num
    }
}