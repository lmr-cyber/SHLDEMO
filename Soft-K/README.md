# 分割、排序和合并操作
## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again.
You can use System.out.printin() to debug your code. The System.out printin( may not work in case of syntax/runtime error. The version of JDK being used is 1.8.
Note: The main class name must be "Solution".
---
You are given a list of integers of size N. Write an algorithm to sort the first K elements (from list[0] to list[K-1]) of the list in ascending order and the remaining (list[K] to list[N-1]) elements in descending order.
### Input
The first line of the input consists of an integer- inputList_size, representing the number of elements in the list (N).
The next line consists of N space-separated integers representing the elements of the list.
The last line consists of an integer- num, representing the number of elements to be sorted in ascending order (K).
### Output
Print N space-separated integers representing the sorted list.
### Constraints
num ≤ inputList_size
### Example

```
Input:
8
11 7 5 10 46 23 16 8
3
Output:
5 7 11 46 23 16 10 8
Explanation:
The first three elements must be arranged in increasing order and the remaining elements in decreasing order.
So, the final list is [5, 7, 11, 46, 23, 16, 10, 8].
```
