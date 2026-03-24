# 异或算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

A company provides network encryption for secure data transfer. The data string is encrypted prior to transmission and gets decrypted at the receiving end. But due to some technical error, the encrypted data is lost and the received string is different from the original string by 1 character. Arnold, a network administrator, is tasked with finding the character that got lost in the network so that the bug does not harm other data that is being transferred through the network.
Write an algorithm to help Arnold find the character that was missing at the receiving end but present at the sending end.

### Input
- The first line of the input consists of a string - stringSent, representing the string that was sent through the network.
- The next line consists of a string - stringRec, representing the string that was received at the receiving end of the network.

### Output
Print a character representing the character that was lost in the network during transmission.

### Note
The input strings stringSent and stringRec consist of lowercase and uppercase English alphabets (i.e. a-z, A-Z).

### Example
```
Input:
abcdfigerj
abcdfiger

Output:
j

Explanation:
The character j at the end of the sent string was lost in the network during transmission.

```
