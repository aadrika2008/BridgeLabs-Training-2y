package com.gla.String.level2;
import java.util.*;

public class WordLength2D {static int findLength(String text) {

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

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {
                words[index] = word;
                index++;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    static String[][] wordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int length = findLength(words[i]);

            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = wordLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {

            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }
    }

}
