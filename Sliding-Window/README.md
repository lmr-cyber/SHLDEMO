# 滑动窗口算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. 
The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

Given a binary string S consisting of only 0s and 1s, write an algorithm to find the number of different ways to get the longest consecutive sub-segment of 1s only. 
You are allowed to change any K number of 0s to 1s. If two ways lead to the same string, they are considered to be similar, not different.

### Input
- The first line of the input consists of the string (S).
- The second line consists of an integer - changeK, representing the number of changes you can make (K).

### Output
Print an integer representing the number of different ways possible to get the longest consecutive sub-segment of 1s.

### Constraints
- 1 ≤ size of string ≤ 2*10⁵
- 0 ≤ changeK ≤ size
- 
### Example
```
Input:
1010101
1

Output:
3

Explanation:
Since only one change is allowed the different combinations possible are 1110101, 1011101 and 1010111. 
In all the possible combinations the maximum reading with consecutive 1s is in 1011101 le 111 so 3 is the output

```
