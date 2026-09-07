package com.gla.sorting.level2;
import java.util.Arrays;
import java.util.Scanner;


public class SearchChallenge {static int firstMissingPositive(int[] arr) {

    int n = arr.length;

    for (int i = 1; i <= n + 1; i++) {

        boolean found = false;

        for (int j = 0; j < n; j++) {

            if (arr[j] == i) {
                found = true;
                break;
            }
        }

        if (!found) {
            return i;
        }
    }

    return -1;
}

    // Binary Search
    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 4, -1, 1};

        // Linear Search
        int missing = firstMissingPositive(arr);

        System.out.println("First missing positive: " + missing);

        // Sort array before Binary Search
        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);

        System.out.println("Target index: " + index);
    }
}
