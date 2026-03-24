package demo.shl.exam;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();  // number of days
        int type = scanner.nextInt(); // type of tasks (always 2)

        int[][] days = new int[num][2];
        for (int i = 0; i < num; i++) {
            days[i][0] = scanner.nextInt(); // easy task payment
            days[i][1] = scanner.nextInt(); // hard task payment
        }

        // dp[i][0] = max salary up to day i, doing no task on day i
        // dp[i][1] = max salary up to day i, doing easy task on day i
        // dp[i][2] = max salary up to day i, doing difficult task on day i
        long[][] dp = new long[num][3];

        // Base case: day 0
        dp[0][0] = 0;                    // do nothing on day 0
        dp[0][1] = days[0][0];          // do easy task on day 0
        dp[0][2] = days[0][1];          // do hard task on day 0

        for (int i = 1; i < num; i++) {
            // Do nothing on day i: previous day can be anything
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));

            // Do easy task on day i: previous day can be nothing or easy (not hard)
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]) + days[i][0];

            // Do hard task on day i: previous day must be nothing
            dp[i][2] = dp[i - 1][0] + days[i][1];
        }

        // Result is the max of all states on the last day
        long result = Math.max(dp[num - 1][0], Math.max(dp[num - 1][1], dp[num - 1][2]));
        System.out.println(result);

        scanner.close();
    }
}