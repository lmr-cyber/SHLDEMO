package demo.shl.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(input[i]);
            if (value % 2 == 0) {
                evenNumbers.add(value);
            } else {
                oddNumbers.add(value);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(evenNumbers);
        result.addAll(oddNumbers);

        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }

        scanner.close();
    }
}
