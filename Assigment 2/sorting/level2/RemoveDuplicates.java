package com.gla.sorting.level2;
import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicates {    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    StringBuilder result = new StringBuilder();
    HashSet<Character> set = new HashSet<>();

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if (!set.contains(ch)) {
            result.append(ch);
            set.add(ch);
        }
    }

    System.out.println("String without duplicates: " + result);
}

}
