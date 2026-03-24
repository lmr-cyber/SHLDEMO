# 快速选择算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. 
The version of JDK being used is 1.8.
Note: The main class name must be "Solution".
---

Andrew is a stock trader who trades in N selected stocks. He has calculated the relative stock price changes in the N stocks from the previous day stock prices. 
Now, his lucky number is K, so he wishes to invest in the particular stock that has the Kth smallest relative stock value.
Write an algorithm for Andrew to find the Kth smallest stock price out of the selected N stocks.
### Input
- The first line of the input consists of an integer - stock_size, representing the number of selected stocks (N).
- The second line consists of N space-separated integers - stock₀, stock₁, …, stockₙ₋₁, representing the relative stock prices of the selected stocks.
- The third line consists of an integer - valueK, representing the value K for which he wishes to find the stock price.
### Output
Print an integer representing the Kth smallest stock price of selected N stocks.
### Constraints
- 0 < valueK ≤ stock_size ≤ 10⁶
- 0 ≤ stockᵢ ≤ 10⁶
- 0 ≤ i < stock_size
### Example
```
Input:
5
10 5 7 88 19
3

Output:
10

Explanation:
The sorted relative stock prices are [5, 7, 10, 19, 88].
So, the 3rd smallest stock price is 10.

```
