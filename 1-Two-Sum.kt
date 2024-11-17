class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexes = hashMapOf<Int, Int>()
        for (index in nums.indices) {
            val answer = indexes[nums[index]]
            if (answer != null) {
                return intArrayOf(index, answer)
            }

            val difference = target - nums[index]
            indexes[difference] = index
        }

        return intArrayOf(0, 0)
    }
}