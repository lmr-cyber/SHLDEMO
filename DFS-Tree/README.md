# 算法：树结构的深度优先搜索

## Question

### Input
- The first line of the input consists of an integer - num, representing the number of nodes in the tree (N).
- The second line consists N space-separated integers representing the value of each node in the tree.
- The third line consists of two space-separated integers - numEdges and numNodes, representing the number of edges (E) and the number of nodes forming an edge (where V = 2 always), respectively.
- The next E lines consist of two space-separated integers - start and end, representing the indices of the starting node and ending node of an edge of the tree.

### Output
Print an integer representing the maximum possible score.

### Constraints
- 1 ≤ num ≤ 10^3
- -10^3 ≤ val ≤ 10^3; where val is the value of a node
- numEdges = num-1
- numNodes = 2

### Example
```
Input:
4
-1 2 3 2
3 2
1 2
1 3
3 4

Output:
-12

Explanation:

       1(-1)
       /   \
     2(2)   3(3)
            /
         4(2)

There is only one route from leaf 2 to leaf 4, as there are only 2 leaves.
(2)->(1): Score = 2*-1=-2
(2)->(1)>(3): Score = -2 * 3 = -6
(2)->(1)->(3)>(4):Score = -6*2 =-12
So best possible answer is -12.

```
