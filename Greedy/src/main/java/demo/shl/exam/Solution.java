package demo.shl.exam;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] counts = new int[num];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < num; i++) {
            counts[i] = Integer.parseInt(input[i]);
        }
        scanner.close();

        System.out.println(maximumDays(counts));
    }

    /**
     * Calculates the maximum number of days the salesman can work.
     * Uses a greedy approach with a max heap (priority queue).
     * At each step, we pick the town with the most remaining visits
     * that is different from the current town.
     */
    public static int maximumDays(int[] counts) {
        // Max heap: sort by count in descending order
        PriorityQueue<Town> pq = new PriorityQueue<>((a, b) -> b.count - a.count);

        for (int i = 0; i < counts.length; i++) {
            pq.offer(new Town(i, counts[i]));
        }

        int totalDays = 0;
        Town prev = null;  // Previous town used

        while (!pq.isEmpty()) {
            Town current = pq.poll();

            // If we have a previous town and it's the same as current,
            // we need to pick a different town
            if (prev != null && prev.id == current.id) {
                if (pq.isEmpty()) {
                    // No other town available, we're done
                    break;
                }
                // Pick the next best town (different from current)
                Town next = pq.poll();
                totalDays++;
                next.count--;
                if (next.count > 0) {
                    pq.offer(next);
                }
                // Put current town back for future use
                pq.offer(current);
                // Update prev to next (the town we just used)
                prev = next;
            } else {
                // Use current town (different from prev or first iteration)
                totalDays++;
                current.count--;
                if (current.count > 0) {
                    pq.offer(current);
                }
                prev = current;
            }
        }

        return totalDays;
    }

    static class Town {
        int id;
        int count;

        Town(int id, int count) {
            this.id = id;
            this.count = count;
        }
    }
}