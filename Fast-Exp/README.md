# 快速幂算法 

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. 
The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

Bob has to send a secret code S to his boss. He designs a method to encrypt the code using two key values N and M. The formula that he uses to develop the encrypted code is shown below:
(((S^N % 10)^M) % 1000000007)
Write an algorithm to help Bob encrypt the code.

### Input
- The first line of the input consists of an integer secretCode, representing the secret code (S).
- The second line consists of an integer firstKey, representing the first key value (N).
- The third line consists of an integer secondKey, representing the second key value (M).

### Output
Print an integer representing the code encrypted by Bob.

### Constraints
- 1 ≤ secretCode ≤ 10⁹
- 0 ≤ firstKey, secondKey ≤ 1000007

### Example
```
Input:
2
3
4

Output:
4096

Explanation:
S = 2, N = 3, M = 4 and the formula of the encrypted code is:
(((2^3 % 10)^4) % 1000000007) = 4096
So, the output is 4096.
```
