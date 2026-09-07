package com.gla.Array.level2;
import java.util.Scanner;

public class EmployeeBonus {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double[] salary = new double[10];
    double[] years = new double[10];
    double[] bonus = new double[10];
    double[] newSalary = new double[10];

    double totalBonus = 0;
    double totalOldSalary = 0;
    double totalNewSalary = 0;

    // Taking input
    for (int i = 0; i < 10; i++) {

        System.out.println("Employee " + (i + 1));

        System.out.print("Enter salary: ");
        salary[i] = sc.nextDouble();

        System.out.print("Enter years of service: ");
        years[i] = sc.nextDouble();

        if (salary[i] <= 0 || years[i] < 0) {
            System.out.println("Invalid input. Enter again.");
            i--;
        }
    }

    // Calculate bonus
    for (int i = 0; i < 10; i++) {

        if (years[i] > 5) {
            bonus[i] = salary[i] * 0.05;
        }
        else {
            bonus[i] = salary[i] * 0.02;
        }

        newSalary[i] = salary[i] + bonus[i];

        totalBonus = totalBonus + bonus[i];
        totalOldSalary = totalOldSalary + salary[i];
        totalNewSalary = totalNewSalary + newSalary[i];
    }

    System.out.println("\nEmployee Details:");

    for (int i = 0; i < 10; i++) {
        System.out.println("Employee " + (i + 1)
                + " Old Salary = " + salary[i]
                + ", Bonus = " + bonus[i]
                + ", New Salary = " + newSalary[i]);
    }

    System.out.println("\nTotal Old Salary = " + totalOldSalary);
    System.out.println("Total Bonus = " + totalBonus);
    System.out.println("Total New Salary = " + totalNewSalary);

    sc.close();
}

}
