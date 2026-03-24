# 遍历交换算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use System.out.printin() to debug your code. The System.out.printin() may not work in case of syntax/runtime error. 
The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

You are given a list of N unique positive numbers ranging from 0 to (N -1). Write an algorithm to replace the value of each number with its corresponding index value in the list.

### Input
- The first line of the input consists of an integer size, representing the size of the list (N).
- The next line consists of N space-separated integers, arr[0], arr[1].... arr[N-1] representing the given list of numbers.

### Output
Print N space-separated integers representing the list obtained by replacing the values of the numbers with their corresponding index values in the list.

### Constraints
- 0 < size ≤ 10^5
- 0 ≤ arr[i] ≤ 10^5
- 0 ≤ i < size

### Note
All the numbers in the list are unique.

### Example

```
Input:
4
3 2 0 1

Output:
2 3 1 0

Explanation:
Before the change, the elements of the list are: arr[0]=3, arr[1]=2, arr[2]=0 and arr[3]=1
After the change, the elements of the list are: arr[0]=2, arr[1]=3, arr[2]=1 and arr[3]=0
```
