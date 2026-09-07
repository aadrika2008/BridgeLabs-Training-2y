package com.gla.Array.level2;
import java.util.Scanner;

public class StudentMarks {    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int number = sc.nextInt();

    int[] physics = new int[number];
    int[] chemistry = new int[number];
    int[] maths = new int[number];

    double[] percentage = new double[number];
    char[] grade = new char[number];

    for (int i = 0; i < number; i++) {

        System.out.println("\nStudent " + (i + 1));

        do {
            System.out.print("Physics marks: ");
            physics[i] = sc.nextInt();

            if (physics[i] < 0) {
                System.out.println("Enter positive marks.");
            }
        } while (physics[i] < 0);

        do {
            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextInt();

            if (chemistry[i] < 0) {
                System.out.println("Enter positive marks.");
            }
        } while (chemistry[i] < 0);

        do {
            System.out.print("Maths marks: ");
            maths[i] = sc.nextInt();

            if (maths[i] < 0) {
                System.out.println("Enter positive marks.");
            }
        } while (maths[i] < 0);

        percentage[i] =
                (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
        System.out.println("Physics = " + physics[i]);
        System.out.println("Chemistry = " + chemistry[i]);
        System.out.println("Maths = " + maths[i]);
        System.out.println("Percentage = " + percentage[i]);
        System.out.println("Grade = " + grade[i]);
    }

    sc.close();
}

}
