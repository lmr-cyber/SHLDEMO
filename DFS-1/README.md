# 深度优先搜索（DFS）算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use System.out printing) to debug your code. The System.out printing may not work in case of syntax/runtime error. 
The version of JD being used is 1.8.
Note: The main class name must be "Solution"

---

The city authorities conduct a study of the houses in a residential area for a city planning scheme. The area is depicted in an aerial view and divided into an Nix M grid. 
If a grid cell contains some part of a house roof, then it is assigned the value 1; otherwise, the cell represents a vacant plot and is assigned the value 0. 
Clusters of adjacent grid cells with value 1 represent a single house.
Diagonally placed grids with value 1 do not represent a single house. The area of a house is the number of 1s that it spans.

Write an algorithm to find the area of the largest house.

### Input
- The first line of the input consists of two space-separated integers-rows and cols representing the number of rows (N) and the number of columns in the grid (M), respectively.
- The next N lines consist of M space-separated integers representing the grid.

### Output
Print an integer representing the area of the largest house.

### Constraints
The elements of the grid consist of Os and 1s only.

### Example 
```
input:
5 5
0 0 0 0 0
0 1 1 0 0
0 0 0 0 0
0 0 1 1 0
0 0 1 0 0

Output:
3

Explanation:
The area of the biggest house is 3.
So, the output is 3.

```
