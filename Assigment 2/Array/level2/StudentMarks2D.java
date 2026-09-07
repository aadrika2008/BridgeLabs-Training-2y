package com.gla.Array.level2;
import java.util.Scanner;

public class StudentMarks2D {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int number = sc.nextInt();

    int[][] marks = new int[number][3];

    double[] percentage = new double[number];
    char[] grade = new char[number];

    for (int i = 0; i < number; i++) {

        System.out.println("\nStudent " + (i + 1));

        for (int j = 0; j < 3; j++) {

            do {
                if (j == 0)
                    System.out.print("Enter Physics marks: ");
                else if (j == 1)
                    System.out.print("Enter Chemistry marks: ");
                else
                    System.out.print("Enter Maths marks: ");

                marks[i][j] = sc.nextInt();

                if (marks[i][j] < 0) {
                    System.out.println("Enter positive marks.");
                }

            } while (marks[i][j] < 0);
        }

        percentage[i] =
                (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

        if (percentage[i] >= 90) {
            grade[i] = 'A';
        }
        else if (percentage[i] >= 80) {
            grade[i] = 'B';
        }
        else if (percentage[i] >= 70) {
            grade[i] = 'C';
        }
        else if (percentage[i] >= 60) {
            grade[i] = 'D';
        }
        else {
            grade[i] = 'F';
        }
    }

    System.out.println("\nStudent Results:");

    for (int i = 0; i < number; i++) {

        System.out.println("\nStudent " + (i + 1));
        System.out.println("Physics = " + marks[i][0]);
        System.out.println("Chemistry = " + marks[i][1]);
        System.out.println("Maths = " + marks[i][2]);
        System.out.println("Percentage = " + percentage[i]);
        System.out.println("Grade = " + grade[i]);
    }

    sc.close();
}

}
