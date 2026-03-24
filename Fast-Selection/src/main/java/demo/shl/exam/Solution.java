package demo.shl.exam;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stockSize = scanner.nextInt();
        int[] stocks = new int[stockSize];

        for (int i = 0; i < stockSize; i++) {
            stocks[i] = scanner.nextInt();
        }

        int valueK = scanner.nextInt();

        int result = findKthSmallest(stocks, valueK);
        System.out.println(result);

        scanner.close();
    }

    /**
     * Find the Kth smallest element using Quickselect algorithm.
     * @param arr The input array
     * @param k The kth smallest element to find (1-indexed)
     * @return The kth smallest element
     */
    public static int findKthSmallest(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int pivotIndex = partition(arr, left, right);

            if (pivotIndex == k - 1) {
                return arr[pivotIndex];
            } else if (pivotIndex < k - 1) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }

        return arr[left];
    }

    /**
     * Partition the array around a pivot element.
     * Elements smaller than pivot will be on the left, larger on the right.
     */
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, right);
        return i;
    }

    /**
     * Swap two elements in the array.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}