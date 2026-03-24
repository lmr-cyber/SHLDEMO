package demo.shl.exam;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine().trim());
        String[] likesStr = scanner.nextLine().trim().split(" ");
        int[] likes = new int[num];
        for (int i = 0; i < num; i++) {
            likes[i] = Integer.parseInt(likesStr[i]);
        }
        scanner.close();

        List<Integer> result = findMaxCycle(num, likes);
        printResult(result);
    }

    /**
     * Find the largest cycle in the functional graph.
     * If multiple cycles of the same maximum size exist, return the lexicographically smallest one.
     */
    public static List<Integer> findMaxCycle(int num, int[] likes) {
        boolean[] visited = new boolean[num];
        List<Integer> largestCycle = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (!visited[i]) {
                List<Integer> cycle = findCycle(i, likes, visited);
                if (cycle.size() > largestCycle.size()) {
                    largestCycle = cycle;
                } else if (cycle.size() == largestCycle.size() && !cycle.isEmpty() && !largestCycle.isEmpty()) {
                    // Compare lexicographically
                    if (isLexicographicallySmaller(cycle, largestCycle)) {
                        largestCycle = cycle;
                    }
                }
            }
        }

        return largestCycle;
    }

    /**
     * Find the cycle starting from the given node using DFS.
     * Returns the cycle as a list of node IDs (0-indexed).
     */
    private static List<Integer> findCycle(int start, int[] likes, boolean[] visited) {
        List<Integer> cycle = new ArrayList<>();
        int current = start;

        while (!visited[current]) {
            visited[current] = true;
            cycle.add(current);
            current = likes[current] - 1; // Convert to 0-indexed
        }

        // Find where the cycle starts
        int cycleStart = -1;
        for (int i = 0; i < cycle.size(); i++) {
            if (cycle.get(i) == current) {
                cycleStart = i;
                break;
            }
        }

        // Extract just the cycle part
        if (cycleStart >= 0) {
            List<Integer> actualCycle = new ArrayList<>();
            for (int i = cycleStart; i < cycle.size(); i++) {
                actualCycle.add(cycle.get(i));
            }
            return actualCycle;
        }

        return new ArrayList<>();
    }

    /**
     * Check if cycle1 is lexicographically smaller than cycle2.
     */
    private static boolean isLexicographicallySmaller(List<Integer> cycle1, List<Integer> cycle2) {
        int size = Math.min(cycle1.size(), cycle2.size());
        for (int i = 0; i < size; i++) {
            if (cycle1.get(i) < cycle2.get(i)) {
                return true;
            } else if (cycle1.get(i) > cycle2.get(i)) {
                return false;
            }
        }
        return cycle1.size() < cycle2.size();
    }

    private static void printResult(List<Integer> result) {
        // Convert to 1-indexed for output
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(result.get(i) + 1);
        }
        System.out.println(sb.toString());
    }
}