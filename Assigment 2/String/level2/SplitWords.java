package com.gla.String.level2;
import java.util.*;

public class SplitWords {static int findLength(String text) {

    int count = 0;

    while (true) {
        try {
            text.charAt(count);
            count++;
        } catch (StringIndexOutOfBoundsException e) {
            break;
        }
    }

    return count;
}

    static String[] splitWords(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }

        words[wordIndex] = word;

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("\nWords using user-defined method:");

        for (String word : userWords) {
            System.out.println(word);
        }

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("\nBoth results are same: " + result);
    }

}
