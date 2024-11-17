class Solution {
    fun findLHS(nums: IntArray): Int {
        Arrays.sort(nums)
        val countMap = mutableMapOf<Int, Int>()

        for (number in nums) {
            val count = countMap.getOrDefault(number, 0)
            countMap[number] = count + 1
        }

        if (countMap.size == 1) return 0

        var max = 0
        val counts = countMap.values
        val keys = mutableListOf<Int>()
        for (elem in countMap) {
            if (keys.size == 0) {
                keys.add(elem.key)
                continue
            }
            val previousItem = countMap[keys.last()]
            val currentItem = countMap[elem.key]

            if (keys.last() + 1 == elem.key) {
                val sum = previousItem!! + currentItem!!
                if (sum > max) {
                    max = sum
                }
            }

            keys.add(elem.key)
        }

        return max
    }
}

/*
* sort the array
Arrays.sort(nums)

* make mutable map
key: element number, value : number of element numbers in nums array

* iterate the map
comparing the two keys

* max = 0

[1,3,2,2,5,2,3,7] -> [1, 2, 2, 2, 3, 3, 5, 7]
map
{1: 1, 2: 3, 3: 2, 5: 1, 7: 1}

if the key[start], key[end] has difference of 1,
sum = value[start] + value[end]
compare the max number of sum
if (sum > max) max = sum

return max
 */