package Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        if (text.isEmpty()) {
            System.out.println("First character: No character available");
            System.out.println("Last character: No character available");
        } else {
            System.out.println("First character: " + text.charAt(0));
            System.out.println("Last character: " + text.charAt(text.length() - 1));
        }

        sc.close();
    }
}
