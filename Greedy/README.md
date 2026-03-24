# 贪心策略结合数学推导
## Question
The current selected programming language is java. We emphasize the submission of a fully working code over partially correct but efficient code.
Once submitted, you cannot review this problem again. You can use System.out.printing to debug your code. The System.outprinting may not work in case of syntax/runtime error. 
The version of JDK being used is 1.8.
Note: The main class name must be "Solution".
---


Moche Goldberg is a traveling salesman. He works in N towns. Each day he sells his products in one of the towns. 
The towns that are chosen on any two successive days should be different and a town I can be chosen at most ci times. 
Write an algorithm to determine the number of days when he can sell in the given towns following the above-mentioned rules.

### Input
The first line of the input consists of an integer num, representing the number of towns (N).
The next line consists of N space-separated integers - countTown0, countTown1, ..., countTownN-1 representing the number of times each town can be chosen.

### Output
Print an integer representing the maximum number of days during which the salesman can work.

### Constraints
- 1 ≤ num ≤ 5 * 10^4
- 1 ≤ countTown(i) ≤ num
- ∑countTown(i) ≤ 10^5
- 0 ≤ i < N

### Example
```
Input:
3
7 2 3

Output:
11

Explanation:
The first, second and third towns are chosen 7, 2 and 3 times respectively.
The different towns are selected on successive days in a sequence: first, second, first, third, first, second, first, third, first, third, first.
So, the maximum number of days during which a salesman can sell is 11.
```
