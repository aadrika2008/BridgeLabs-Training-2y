package com.gla.sorting.level1;
import java.util.Arrays;
public class SelectionSort {public static void main(String[] args) {

    int[] scores = {85, 60, 95, 70, 50};

    for (int i = 0; i < scores.length - 1; i++) {

        int minIndex = i;

        for (int j = i + 1; j < scores.length; j++) {

            if (scores[j] < scores[minIndex]) {
                minIndex = j;
            }
        }

        int temp = scores[i];
        scores[i] = scores[minIndex];
        scores[minIndex] = temp;
    }

    System.out.println("Sorted Scores: " + Arrays.toString(scores));
}

}
