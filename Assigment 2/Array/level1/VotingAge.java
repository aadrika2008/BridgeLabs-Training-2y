package com.gla.Array.level1;
import java.util.Scanner;

public class VotingAge {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] age = new int[10];

    // Taking input
    for (int i = 0; i < age.length; i++) {
        System.out.print("Enter age of student " + (i + 1) + ": ");
        age[i] = sc.nextInt();
    }

    // Checking age
    for (int i = 0; i < age.length; i++) {

        if (age[i] < 0) {
            System.out.println("Invalid age: " + age[i]);
        }
        else if (age[i] >= 18) {
            System.out.println("The student with the age " + age[i] + " can vote.");
        }
        else {
            System.out.println("The student with the age " + age[i] + " cannot vote.");
        }
    }

    sc.close();
}
}
