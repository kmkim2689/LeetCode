1class Solution {
2    fun groupAnagrams(strs: Array<String>): List<List<String>> {
3        val solution = hashMapOf<String, ArrayList<String>>()
4        for (str in strs) {
5            val sorted = str.toList().sorted().joinToString("")
6            val value = solution[sorted]
7            if (value == null) {
8                solution[sorted] = arrayListOf(str)
9            } else {
10                value.add(str)
11            }
12        }
13
14        return solution.map { it.value }
15    }
16}
17
18/**
19eat
20tea
21tan
22ate
23nat
24bat
25
26e - 1
27a - 1
28t - 1
29
30aa
31aa
32bb
33bb
34c
35cc
36 */