# 动态规划算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. 
You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. The version of JDK being used is 1.8.
Note: The main class name must be "Solution".
---

Sheldon is going to a book fair where all the books are star-rated. As he is interested in just two types of books, Horror and Sci-fi, so he would buy the books from these two categories only. 
He would want to buy at least one book from each category so as to maximize the total star-rating of his books. Also, the total price of the books should not exceed the amount of money that he can spend. 
The output is -1 if it is not possible to buy at least one book from both the categories with the money that he has.
Write an algorithm to help Sheldon buy the books from both the categories.

### Input
- The first line of the input consists of an integer - amount, representing the amount of money Sheldon can spend.
- The second line consists of two integers - numHorror and numH, representing the number of Horror books (H) and the number of values given for every horror book (X is always equal to 2, respectively).
- The next H lines consist of X space-separated integers - hrating and hprice, representing the star-rating and the price of each Horror book, respectively.
- The next line consists of two space-separated integers - numSciFi and numS, representing the number of Sci-fi books (S) and the number of values given for every Sci-fi book (P is always equal to 2, respectively).
- The last S lines consist of P space-separated integers - srating and sprice, representing the star-rating and the price of each Sci-fi book, respectively.
### Output
Print an integer representing the total maximum star-rating of books bought by Sheldon. If he cannot buy at least one book from both the categories then print -1.
### Constraints
```
1 ≤ numHorror ≤ 1000
1 ≤ numSciFi ≤ 1000
1 ≤ amount ≤ 10⁵
1 ≤ hrating, srating ≤ 10⁶
1 ≤ hprice, sprice ≤ 10⁵
numH = 2
numS = 2
```

### Example

```
Input:
50
3 2
5 10
3 30
6 20
3 2
6 30
2 10
5 10
```
