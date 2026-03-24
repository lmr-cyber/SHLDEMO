package demo.shl.exam;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputSize = sc.nextInt();
        sc.nextLine();

        Integer[] inputs = new Integer[inputSize];
        String[] elements = sc.nextLine().split(" ");
        for (int i = 0; i < inputSize; i++) {
            inputs[i] = Integer.parseInt(elements[i]);
        }

        int num = sc.nextInt();

        sc.close();

        // Sort first K elements in ascending order
        Arrays.sort(inputs, 0, num);

        // Sort remaining elements in descending order using Comparator
        Arrays.sort(inputs, num, inputSize, Collections.reverseOrder());

        // Print result
        for (int i = 0; i < inputSize; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(inputs[i]);
        }
        System.out.println();
    }
}
