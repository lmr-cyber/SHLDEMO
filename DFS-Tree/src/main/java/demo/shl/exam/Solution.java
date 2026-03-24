package demo.shl.exam;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine().trim());
        String[] valuesStr = scanner.nextLine().trim().split(" ");
        int[] values = new int[num];
        for (int i = 0; i < num; i++) {
            values[i] = Integer.parseInt(valuesStr[i]);
        }

        String[] edgesInfo = scanner.nextLine().trim().split(" ");
        int numEdges = Integer.parseInt(edgesInfo[0]);
        int numNodes = Integer.parseInt(edgesInfo[1]); // Always 2

        // Build adjacency list for the tree
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < numEdges; i++) {
            String[] edge = scanner.nextLine().trim().split(" ");
            int start = Integer.parseInt(edge[0]) - 1; // Convert to 0-indexed
            int end = Integer.parseInt(edge[1]) - 1;   // Convert to 0-indexed
            adj.get(start).add(end);
            adj.get(end).add(start);
        }

        scanner.close();

        long maxScore = findMaxScore(num, values, adj);
        System.out.println(maxScore);
    }

    /**
     * Find the maximum score path in the tree.
     * The score is the product of node values along a path from one leaf to another.
     */
    public static long findMaxScore(int num, int[] values, List<List<Integer>> adj) {
        // Handle single node case
        if (num == 1) {
            return values[0];
        }

        // Find all leaves (nodes with only one neighbor)
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (adj.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        long maxScore = Long.MIN_VALUE;

        // For each pair of leaves, find the path and calculate the score
        for (int i = 0; i < leaves.size(); i++) {
            for (int j = i + 1; j < leaves.size(); j++) {
                int startLeaf = leaves.get(i);
                int endLeaf = leaves.get(j);

                // Find path between the two leaves using DFS
                List<Integer> path = findPath(adj, startLeaf, endLeaf, num);

                if (path != null) {
                    long score = calculatePathScore(path, values);
                    maxScore = Math.max(maxScore, score);
                }
            }
        }

        return maxScore;
    }

    /**
     * Find the path between two nodes using DFS.
     */
    private static List<Integer> findPath(List<List<Integer>> adj, int start, int end, int num) {
        boolean[] visited = new boolean[num];
        Map<Integer, Integer> parent = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current == end) {
                // Reconstruct path
                List<Integer> path = new ArrayList<>();
                int node = end;
                while (node != start) {
                    path.add(node);
                    node = parent.get(node);
                }
                path.add(start);
                Collections.reverse(path);
                return path;
            }

            for (int neighbor : adj.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent.put(neighbor, current);
                    stack.push(neighbor);
                }
            }
        }

        return null;
    }

    /**
     * Calculate the score (product) of a path.
     */
    private static long calculatePathScore(List<Integer> path, int[] values) {
        long score = 1;
        for (int node : path) {
            score *= values[node];
        }
        return score;
    }
}