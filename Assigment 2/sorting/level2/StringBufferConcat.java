package com.gla.sorting.level2;
import java.util.Scanner;

public class StringBufferConcat { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of strings: ");
    int n = sc.nextInt();

    StringBuffer result = new StringBuffer();

    for (int i = 0; i < n; i++) {

        System.out.print("Enter string " + (i + 1) + ": ");
        String str = sc.next();

        result.append(str);
    }

    System.out.println("Concatenated String: " + result);
}
}
