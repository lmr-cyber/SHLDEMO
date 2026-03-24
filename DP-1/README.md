# 动态规划算法 (6)

## Question
The current selected programming language is Java 11. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. The version of Java 11 being used is 11.0.2.
Note: The main class name must be "Solution".

---

Stephen is doing an internship in a company for N days. Each day, he may choose an easy task or a difficult task. He may also choose to perform no task at all. He chooses a difficult task on days when and only when he did not perform any work the previous day. The amounts paid by the company for both the easy and difficult tasks can vary each day, but the company always pays more for difficult tasks.
Write an algorithm to help Stephen earn the maximum salary.

### Input
The first line of the input consists of two space-separated integers: num and type, representing the number of days of the internship (N) and types of tasks available for each day (M is always equal to 2, respectively).
The next N lines consist of M space-separated integers: easy and hard, representing the amount set to be paid for the easy task and the difficult task on that day, respectively.

### Output
Print an integer representing the maximum salary that Stephen can earn.

### Constraints
```
1 ≤ num ≤ 10⁵
type = 2
2 ≤ hard ≤ 10⁴
1 ≤ easy < hard
```

### Example
```
Input:
4 2
1 2
4 10
20 21
2 23

Output:
33

Explanation:
To earn the maximum salary, select the difficult task (10) from the 2nd row and the difficult task (23) from the 4th row. The maximum salary earned = 10 + 23 = 33.
```
