package demo.shl.exam;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCust = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");
        int count = 0;

        for (int i = 0; i < numOfCust; i++) {
            int bill = Integer.parseInt(input[i]);
            if (isPerfectSquare(bill)) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }

    private static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0) {
            return true;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}