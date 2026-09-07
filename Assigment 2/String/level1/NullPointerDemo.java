package com.gla.String.level1;
import java.util.*;

public class NullPointerDemo {    static void generateException() {
    String text = null;

    System.out.println(text.length());
}

    // Method to handle exception
    static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        // First call the method that generates exception
        // generateException();

        // Then call the method that handles exception
        handleException();
    }

}
