1class Solution {
2    fun groupAnagrams(strs: Array<String>): List<List<String>> {
3        val solution = hashMapOf<String, ArrayList<String>>()
4        for (str in strs) {
5            val charArr = str.toCharArray()
6            charArr.sort()
7            val sortedStr = String(charArr)
8            solution.getOrPut(sortedStr, { arrayListOf<String>() }).add(str)
9        }
10
11        return ArrayList(solution.values)
12    }
13}
14
15/**
16eat
17tea
18tan
19ate
20nat
21bat
22
23e - 1
24a - 1
25t - 1
26
27aa
28aa
29bb
30bb
31c
32cc
33 */