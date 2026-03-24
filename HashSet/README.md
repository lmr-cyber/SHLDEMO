# 哈希集合（Hash Set）算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. You can use System out printini to debug your code. The
System. out printing may not work in case of syntax/runtime error. The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

You are given two lists of different lengths of positive integers. Write an algorithm to count the number of elements that are not common to each list.

### Input
- The first line of the input consists of an integer - listinpurt_size, an integer representing the number of elements in the first list (N).
- The second line consists of space-separated integers representing the first list of positive integers.
- The third line consists of an integer- listinput size, representing the number of elements in the second list (M).
- The last line consists of M space-separated integers representing the second list of positive integers.

### Output
Print a positive integer representing the count of elements that are not common to both the lists of integers.

### Example
```
Input:
11
1 1 2 3 4 5 5 7 6 9 10
10
11 12 13 4 5 6 7 18 19 20

Output:
12

Explanation:
The numbers that are not common to both lists are [1, 1, 2, 3, 9, 10, 11, 12, 13, 18, 19, 20].
So, the output is 12.
```
