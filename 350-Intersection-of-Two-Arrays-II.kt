class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        var index1 = 0
        var index2 = 0

        val result = mutableListOf<Int>()

        while (index1 < nums1.size && index2 < nums2.size) {
            val element1 = nums1[index1]
            val element2 = nums2[index2]
            if (element1 != element2) {
                if (element1 > element2) {
                    index2++
                } else {
                    index1++
                }
            } else {
                result.add(nums1[index1])
                index1++
                index2++
            }
        }

        return result.toIntArray()
    }
}

/**
My solution

sorting each list
index1, index2 = 0, 0

result = []

comparing each index element of each list
nums1 = [1, 1, 2, 2]
nums2 = [2, 2]

move the one of the index if the compared two numbers are not the same.
if different, move the index that has the smaller element
if the same, move both indexes -> + 1

compare index1 : 0, index2 : 0
1, 2 -> different
-> move index1 -> index = 1

compare index1 : 1, index2 : 0
1, 2 -> different
-> move index1 -> index = 2

compare index1 : 2, index2 : 0
2, 2 -> the same
result = [2]
-> move index1, index2 -> index1 : 3, index2 : 1

compare index1 : 3, index2 : 1
2, 2 -> the same
result = [2, 2]
-> move index1, index2 -> index1 : 4, index2 : 2

if (index1 < num1.size and index2 < nums2.size) continue else break
 */