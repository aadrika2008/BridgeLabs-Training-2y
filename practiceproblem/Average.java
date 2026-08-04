package com.gla.practiceproblem;
import java.util.Scanner;

public class Average { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    double a = sc.nextDouble();

    System.out.print("Enter Second Number: ");
    double b = sc.nextDouble();

    System.out.print("Enter Third Number: ");
    double c = sc.nextDouble();

    double average = (a + b + c) / 3;

    System.out.println("Average = " + average);
}
}
