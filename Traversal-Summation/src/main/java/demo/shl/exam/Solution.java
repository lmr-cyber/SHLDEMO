package demo.shl.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextInt(); // Read constM (always 2, not needed)
        scanner.nextLine();

        int[][] intervals = new int[num][2];
        for (int i = 0; i < num; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        scanner.close();

        if (num == 0) {
            System.out.println(0);
            return;
        }

        // Sort intervals by start station
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Merge intervals and calculate total distance
        int totalDistance = 0;
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < num; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start <= currentEnd) {
                // Overlapping, extend the current interval
                currentEnd = Math.max(currentEnd, end);
            } else {
                // Non-overlapping, add current interval distance and start new one
                totalDistance += currentEnd - currentStart;
                currentStart = start;
                currentEnd = end;
            }
        }

        // Add the last interval
        totalDistance += currentEnd - currentStart;

        System.out.println(totalDistance);
    }
}