package com.gla.String.level1;
import java.util.*;

public class StringIndexDemo {static void generateException(String text) {
    System.out.println(text.charAt(text.length()));
}

    // Method to handle exception
    static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // generateException(text);

        handleException(text);
    }

}
