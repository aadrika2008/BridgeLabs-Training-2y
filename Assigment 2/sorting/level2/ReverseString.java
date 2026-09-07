package com.gla.sorting.level2;
import java.util.Scanner;
public class ReverseString { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    StringBuilder sb = new StringBuilder();

    sb.append(str);

    sb.reverse();

    System.out.println("Reversed String: " + sb);
}
}
