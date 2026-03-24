package demo.shl.exam;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] position = new int[size];
        for (int i = 0; i < size; i++) {
            position[arr[i]] = i;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = position[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}