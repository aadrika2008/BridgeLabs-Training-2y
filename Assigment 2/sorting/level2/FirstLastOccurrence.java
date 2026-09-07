package com.gla.sorting.level2;
import java.util.Scanner;

public class FirstLastOccurrence { static int firstOccurrence(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;
    int result = -1;

    while (left <= right) {

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            result = mid;
            right = mid - 1;   // Search left
        }
        else if (arr[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }

    return result;
}

    static int lastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;   // Search right
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 2, 2, 3, 4, 5};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
