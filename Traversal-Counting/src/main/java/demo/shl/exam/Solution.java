package demo.shl.exam;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementSize = Integer.parseInt(scanner.nextLine().trim());
        String[] elementsStr = scanner.nextLine().trim().split(" ");
        int k = Integer.parseInt(scanner.nextLine().trim());

        int count = 0;
        for (int i = 0; i < elementSize; i++) {
            int element = Integer.parseInt(elementsStr[i]);
            if (element < k) {
                count++;
            }
        }

        System.out.println(count);
    }
}