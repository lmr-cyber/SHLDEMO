package demo.shl.exam;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int changeK = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.println(solve(s, changeK));
    }

    public static int solve(String s, int changeK) {
        int n = s.length();
        char[] arr = s.toCharArray();

        // Sliding window to find max length of consecutive 1s with at most K flips
        // and count how many windows achieve that max length

        int maxLen = 0;
        int count = 0;
        int left = 0;
        int zeros = 0; // count of zeros in current window

        for (int right = 0; right < n; right++) {
            if (arr[right] == '0') {
                zeros++;
            }

            // Shrink window if we have more than K zeros
            while (zeros > changeK) {
                if (arr[left] == '0') {
                    zeros--;
                }
                left++;
            }

            // Current window [left, right] has at most K zeros
            int windowLen = right - left + 1;

            if (windowLen > maxLen) {
                maxLen = windowLen;
                count = 1;
            } else if (windowLen == maxLen && maxLen > 0) {
                count++;
            }
        }

        // If maxLen is 0, it means all characters are 0 and K is 0
        // In this case, we can't make any 1s, so there's 1 way (do nothing)
        // But actually, if maxLen is 0, we should return 0 or n depending on interpretation
        // Looking at the problem, if no 1s can be made, there's no way to get longest segment of 1s
        // Since the problem asks for "ways to get the longest consecutive sub-segment of 1s",
        // if no 1s are possible, the answer should be 0

        if (maxLen == 0) {
            return 0;
        }

        return count;
    }
}