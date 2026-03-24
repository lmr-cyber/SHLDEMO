package demo.shl.exam;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first list
        int list1Size = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String[] list1Input = scanner.nextLine().split(" ");

        // Read second list
        int list2Size = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String[] list2Input = scanner.nextLine().split(" ");

        // Convert to integer arrays
        int[] list1 = new int[list1Size];
        int[] list2 = new int[list2Size];

        for (int i = 0; i < list1Size; i++) {
            list1[i] = Integer.parseInt(list1Input[i]);
        }

        for (int i = 0; i < list2Size; i++) {
            list2[i] = Integer.parseInt(list2Input[i]);
        }

        // Use HashSets to find non-common elements
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : list1) {
            set1.add(num);
        }

        for (int num : list2) {
            set2.add(num);
        }

        // Count elements not common to both lists
        int count = 0;

        // Elements in list1 but not in list2
        for (int num : list1) {
            if (!set2.contains(num)) {
                count++;
            }
        }

        // Elements in list2 but not in list1
        for (int num : list2) {
            if (!set1.contains(num)) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}