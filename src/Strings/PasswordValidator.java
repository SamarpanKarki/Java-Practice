package Strings;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }
            if (Character.isDigit(character)) {
                hasDigit = true;
            }
        }

        if (password.length() >= 8 && hasUppercase && hasDigit) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");

            if (password.length() < 8) {
                System.out.println("Password must contain at least 8 characters.");
            }
            if (!hasUppercase) {
                System.out.println("Password must contain at least one uppercase letter.");
            }
            if (!hasDigit) {
                System.out.println("Password must contain at least one digit.");
            }
        }

        sc.close();
    }
}