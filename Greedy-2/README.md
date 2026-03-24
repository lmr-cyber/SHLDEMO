# 贪心算法

## Question
The current selected programming language is Java. We emphasize the submission of a fully working code over partially correct but efficient code. 
Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. 
The version of JDK being used is 1.8.
Note: The main class name must be "Solution".

---

Ethan is the leader of a team with N members. He has assigned an error score to each member in his team based on the bugs that he has found in that particular team member's task. 
Because the error score has increased to a significantly large value, he wants to give all the team members a chance to improve their error scores, thereby improving their reputation in the organization. 
He introduces a new rule that whenever a team member completes a project successfully, the error score of that member decreases by a count P and the error score of all the other team members whose score is greater than zero decreases by a count Q.
Write an algorithm to help Ethan find the minimum number of projects that the team must complete in order to make the error score of all the team members zero. If no project need to be completed then print 0.

### Input
The first line of the input consists of an integer - errorScore_size, representing the total number of team members (N).
The second line consists of N space-separated integers - errorScore, representing the initial error scores of the team members.
The third line consists of an integer - compP, representing the count by which the error score of the team member who completes a project successfully decreases (P).
The last line consists of an integer - othQ, representing the count by which the error score of the team member whose error score is greater than zero decreases (Q).

### Output
Print an integer representing the minimum number of projects that the team must complete in order to make the error score of all the team members zero. If no project need to be completed then print 0.

### Constraints
- 1 ≤ errorScore_size ≤ 2*10³
- 1 ≤ othQ ≤ compP ≤ 10⁹
- 0 ≤ errorScoreᵢ ≤ 10⁹

### Note
The error score of any team member can never be less than zero.

### Example
```
Input:
3
6 4 1
4
1

Output:
3

Explanation:
Firstly, the first team member completes a project successfully, the updated error score of the team members will be: 2 3 0.
Then, when a second member completes a project successfully, the updated error score of the team members will be: 1 0 0.
Then, when the first member completes another project successfully, the updated score of the team members will be: 0 0 0.
So, the team needs to complete 3 projects to make the error score of all the team members zero.
```
