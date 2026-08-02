package Strings;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String reversedText = new StringBuilder(text).reverse().toString();

        System.out.println("Reversed string: " + reversedText);

        sc.close();
    }
}
