package com.gla.String.level1;
import java.util.*;

public class UpperCaseDemo {static String convertToUpper(String text) {

    String result = "";

    for (int i = 0; i < text.length(); i++) {

        char ch = text.charAt(i);

        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }

        result = result + ch;
    }

    return result;
}

    // Compare two strings using charAt()
    static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = convertToUpper(text);

        String builtInUpper = text.toUpperCase();

        System.out.println("User-defined uppercase: " + userUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);

        boolean result = compareStrings(userUpper, builtInUpper);

        System.out.println("Both results are same: " + result);
    }
}
