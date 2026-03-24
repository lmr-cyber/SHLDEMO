package demo.shl.exam.bfs;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().trim();
        String str2 = scanner.nextLine().trim();
        scanner.close();

        System.out.println(minStepsToConvert(str1, str2));
    }

    public static int minStepsToConvert(String start, String target) {
        if (start.equals(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(start);

        Set<String> visited = new HashSet<>();
        visited.add(start);

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                // Step 1: reverse substring of length 2
                // Step 2: reverse substring of length 3
                // Step N: reverse substring of length N+1
                int len = steps + 1;

                // If substring length exceeds string length, we can't proceed further
                if (len > current.length()) {
                    continue;
                }

                for (int left = 0; left <= current.length() - len; left++) {
                    String next = reverseSubstring(current, left, len);

                    if (next.equals(target)) {
                        return steps;
                    }

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
        }

        return -1;
    }

    private static String reverseSubstring(String s, int start, int length) {
        char[] chars = s.toCharArray();
        int left = start;
        int right = start + length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
