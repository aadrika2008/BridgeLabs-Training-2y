package com.gla.String.level2;
import java.util.*;

public class ShortestLongest {static int findLength(String text) {

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
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;

        return words;
    }

    static String[][] wordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    static int[] findShortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortest][1]);
            int longestLength = Integer.parseInt(data[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = wordLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest word: " + data[result[0]][0]);
        System.out.println("Length: " + data[result[0]][1]);

        System.out.println("Longest word: " + data[result[1]][0]);
        System.out.println("Length: " + data[result[1]][1]);
    }
}
