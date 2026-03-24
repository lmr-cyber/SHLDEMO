# 遍历计数算法

## Question
The current selected programming language is Java We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again.
You can use System.out.println() to debug your code
The System.out.println() may not work in case of syntax/runtime error. The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

You are given a list of integers and an integer K. Write an algorithm to find the number of elements in the list that are strictly less than K.

### Input
- The first line of the input consists of an integer - element_size, representing the number of elements in the list (N).
- The second line consists of N space-separated integers - element[1], element[2], ... element[n], representing the list of integers.
- The last line consists of an integer - num, representing the integer to be compared (K).

### Output
Print a positive integer representing the number of elements in the list that are strictly less than num.

### Constraints

- -10^9 ≤ num ≤ 10^9
- -10^9 ≤ element[1], element[2], ... element[n] ≤ 10^9

### Example

```
input:
7
1 7 4 5 6 3 2
5

Output
4

Explanation:
The numbers that are less than 5 are 1,2,3,4.
So, the output is 4.


```

