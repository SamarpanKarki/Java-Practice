package Strings;

import java.util.Scanner;

public class StringInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.println("Your full name is: " + fullName);

        sc.close();
    }
}