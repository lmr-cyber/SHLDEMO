# 图论结合深度优先搜索（DFS）的算法

## Question
The current selected programming language is Java 11. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use system.out.printin to debug your code. The system.out.printin() may not work in case of syntax/runtime error. 
The version of Java 11 being used is 11.0.2.

---

A University has invited N alumni for a dinner. The dinner table has a circular shape. Each alumnus is assigned an invitation ID from 0 to N-1. 
Each alumnus likes exactly one fellow alumnus and will attend the dinner only if he/she can be seated next to the person he/she likes.

Write an algorithm to find the IDs of the alumni in a lexicographical order so that maximum number of alumni attend the dinner. 
If more than one such seating arrangement exists, then output the one that is lexicographically smaller.

### Input
- The first line of the input consists of an integer num, representing the number of alumni (N).
- The second line consists of N space-separated integers, alumnilD{0], alumnilD[1]...... alumnilD(N-1] representing the ID of the person whom the i-th alumnus likes,

### Output
Print space-separated integers representing the IDs of the alumni who will attend the dinner.

### Note
One alumnus can be liked by multiple alumni.

### Constraints
- 1 ≤ nums 10^5
- 0 ≤ i ≤ num

### Example
```
Input:
4
2 3 4 1

Output:
1 2 3 4

Explanation:
The first alumnus likes the person whose ID is 2.
The second alumnus likes the person whose ID is 3.
The third alumnus likes the person whose ID is 4
The fourth alumnus likes the person whose ID is 1.
A maximum of 4 alumni can be seated around the circular table in the following manner:
1-2-3-4
```
