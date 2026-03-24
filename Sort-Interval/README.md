# 排序+间隔取值算法

## Question

The current selected programming language is Java 21. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use system.out.printin to debug your code. The system.out.printin() may not work in case of syntax/runtime error. 
The version of Java 21 being used is 21.0.4.

---
### Input
- The first line of the input consists of an integer size, representing the size of the given list (N).
- The second line consists of N space-separated integers arr0, arr1...arrN, representing the elements of input list.

### Output
Print space-separated integers representing the alternately sorted elements of the given list.

### Constraints
- 0 < size ≤ 10^6
- -10^6 ≤ arri ≤ 10^6
- 0 ≤ i < size

### Example
```
Input:
8
3 5 1 5 9 10 2 6

Output:
1 3 5 9

Explanation:
After sorting. the list is [1. 2, 3, 5. 5, 6, 9, 10].
So, the alternate elements of the sorted list are [1, 3. 5. 9].
```
