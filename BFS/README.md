# 广度优先搜索（BFS）算法

## Question
case of syntax/runtime error. The version of JDK being used is 1:8
Note: The main class name must be
"Solution".

---

Emerson is very fond of strings, and he keeps trying to reverse them. His mother gives him two binary strings and asks him to convert the binary
string str1 into str2 by applying the following rules:
- Step 1: Reverse any substring of length 2 (of str1) and get str1' ( str1 != str1').
- Step 2: Reverse any substring of length 3 (of str1') and get str1" ( str1' != str1").
- Step 3: Reverse any substring of length 4 (of str1") and get str1" ( str1"!= str1"").
- Step 4, Step 5 and so on.

Write an algorithm to help Emerson convert the binary string str 1 into str2, in the minimum number of steps.

### Input
- The first line of the input consists of a binary string - str1.
- The second line consists of a binary string - str2.

### Output
Print an integer representing the minimum number of steps required to convert str into str2. If there is no such way of conversion, then print "-1"

### Constraints
2 < N ≤ 30; where N is the length of the strings.

### Note
At any step Emerson can reverse only one substring
