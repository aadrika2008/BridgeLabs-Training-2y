package com.gla.String.level2;
import java.util.*;


public class VotingAge {static int[] generateAges(int... ages) {

    return ages;
}

    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    static void display(String[][] data) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        int[] generatedAges = generateAges(
                ages[0], ages[1], ages[2], ages[3], ages[4],
                ages[5], ages[6], ages[7], ages[8], ages[9]);

        String[][] result = checkVoting(generatedAges);

        display(result);
    }
}
