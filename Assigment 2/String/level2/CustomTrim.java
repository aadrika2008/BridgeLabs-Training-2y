package com.gla.String.level2;
import java.util.*;
public class CustomTrim {
    static int[] findTrimPositions(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] positions = findTrimPositions(text);

        String userTrim = createSubstring(
                text, positions[0], positions[1]);

        String builtInTrim = text.trim();

        System.out.println("User-defined trim: [" + userTrim + "]");
        System.out.println("Built-in trim: [" + builtInTrim + "]");

        System.out.println("Both results are same: "
                + compareStrings(userTrim, builtInTrim));
    }
}