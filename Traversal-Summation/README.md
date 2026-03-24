# 简单的遍历求和算法

## Question
The city bus stations are located at equal distances (unit distance) from each other along a straight road. Each station has a unique station ID. 
The buses do not travel to all of the bus stations. The highway administration needs to determine the total distance that the buses cover.

Given the IDs of the bus stations that have a bus operating between them, write an algorithm to help the administration find the distance covered by all the city buses.

### Input
- The first line of the input consists of two space-separated integers num and constM, representing the number of buses (N) and constM is always 2.
- Next N lines consist of const space-separated integers - busStop0 and busStop1, representing the IDs of the bus stations that have a bus operating between them.

### Output
Print an integer representing the distance covered by the buses.

### Constraints

- 0 ≤ num ≤ 10^5
- 1 ≤ busStop0 < busStop1 ≤ 10^6

### Example
```
Input:
3 2
2 4
3 5
6 7

Output:
4
Explanation:
  -----
  |   |
1-2-3-4-5-6-7
    |   | | |
    ----- --- 
```
