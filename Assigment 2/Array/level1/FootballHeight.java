package com.gla.Array.level1;
import java.util.Scanner;

public class FootballHeight {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double[] heights = new double[11];
    double sum = 0;

    for (int i = 0; i < heights.length; i++) {
        System.out.print("Enter height of player " + (i + 1) + ": ");
        heights[i] = sc.nextDouble();

        sum = sum + heights[i];
    }

    double mean = sum / 11;

    System.out.println("Mean height = " + mean);

    sc.close();
}
}
