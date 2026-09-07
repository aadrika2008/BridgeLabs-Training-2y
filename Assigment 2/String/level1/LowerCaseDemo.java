package com.gla.String.level1;
import java.util.*;

public class LowerCaseDemo {    static String convertToLower(String text) {

    String result = "";

    for (int i = 0; i < text.length(); i++) {

        char ch = text.charAt(i);

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
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

        String userLower = convertToLower(text);

        String builtInLower = text.toLowerCase();

        System.out.println("User-defined lowercase: " + userLower);
        System.out.println("Built-in lowercase: " + builtInLower);

        boolean result = compareStrings(userLower, builtInLower);

        System.out.println("Both results are same: " + result);
    }

}
