package demo.shl.exam;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parent = scanner.nextLine();
        String sub = scanner.nextLine();

        int count = bruteForceSearch(parent, sub);

        System.out.println(count);

        scanner.close();
    }

    public static int bruteForceSearch(String text, String pattern) {
        if (text == null || pattern == null || pattern.isEmpty()) {
            return 0;
        }

        text = text.toLowerCase();
        pattern = pattern.toLowerCase();

        int count = 0;
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j = 0;
            while (j < patternLength && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == patternLength) {
                count++;
            }
        }

        return count;
    }
}