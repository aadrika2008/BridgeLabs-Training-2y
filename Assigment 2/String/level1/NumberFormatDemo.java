package com.gla.String.level1;

import java.util.*;

public class NumberFormatDemo {static void generateException(String text) {
    int number = Integer.parseInt(text);
    System.out.println(number);
}

    // Method to handle exception
    static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number = " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = sc.nextLine();

        // generateException(text);

        handleException(text);
    }
}
