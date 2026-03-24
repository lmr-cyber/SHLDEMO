package demo.shl.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        Collections.sort(list);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            result.add(list.get(i));
        }

        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }

        scanner.close();
    }
}