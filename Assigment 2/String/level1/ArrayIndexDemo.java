package com.gla.String.level1;
import java.util.*;

public class ArrayIndexDemo {static void generateException(String[] names) {
    System.out.println(names[names.length]);
}

    // Method to handle exception
    static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        System.out.println("Enter 3 names:");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        // generateException(names);

        handleException(names);
    }

}
