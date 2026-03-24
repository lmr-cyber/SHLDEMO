package demo.shl.exam;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringSent = scanner.nextLine();
        String stringRec = scanner.nextLine();

        char result = findMissingCharacter(stringSent, stringRec);

        System.out.println(result);

        scanner.close();
    }

    public static char findMissingCharacter(String sent, String received) {
        int xorResult = 0;

        // XOR all characters from the sent string
        for (int i = 0; i < sent.length(); i++) {
            xorResult ^= sent.charAt(i);
        }

        // XOR all characters from the received string
        for (int i = 0; i < received.length(); i++) {
            xorResult ^= received.charAt(i);
        }

        // The result is the missing character
        return (char) xorResult;
    }
}
