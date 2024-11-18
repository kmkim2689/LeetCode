class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        var index1 = 0
        val stringMap1 = list1.associateWith {
            index1++
        }

        var result = mutableListOf<String>()
        var minimumValue = Int.MAX_VALUE

        for (index2 in list2.indices) {
            val currentString = list2[index2]
            if (stringMap1[currentString] != null) {
                val sum = stringMap1[currentString]!! + index2
                if (sum < minimumValue) {
                    result.clear()
                    minimumValue = sum
                    result.add(currentString)
                    continue
                }
                if (sum == minimumValue) {
                    result.add(currentString)
                } 
            }
        }

        return result.toTypedArray()
    }
}