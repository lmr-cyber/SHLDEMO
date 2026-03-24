package demo.shl.exam;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String houses = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < houses.length(); i++) {
            char c = houses.charAt(i);
            if (!isVowel(c)) {
                result.append(c);
            }
        }

        System.out.print(result.toString());
    }

    private static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}