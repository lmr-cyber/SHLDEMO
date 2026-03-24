package demo.shl.exam;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needle = Integer.parseInt(scanner.nextLine().trim());
        String haystack = scanner.nextLine().trim();

        int count = 0;

        // Traverse each character in the haystack string
        for (int i = 0; i < haystack.length(); i++) {
            int digit = Character.getNumericValue(haystack.charAt(i));
            if (digit == needle) {
                count++;
            }
        }

        System.out.println(count);
    }
}
