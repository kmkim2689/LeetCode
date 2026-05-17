1class Solution {
2    fun twoSum(nums: IntArray, target: Int): IntArray {
3        val history = HashMap<Int, Int>(nums.size)
4
5        for ((index, num) in nums.withIndex()) {
6            val diff = target - num
7            val idx = history[diff]
8            if (idx != null) {
9                return intArrayOf(index, idx)
10            }
11
12            history[num] = index
13        }
14
15        return intArrayOf()
16    }
17}
18
19/*
209
219 - 2 = 7 [7]
229 - 7 = 2
23
246
256 - 3 = 3 -> diff miss [3]
266 - 2 = 4 -> diff miss [3, 2]
276 - 4 = 2 -> diff hit []
28 */