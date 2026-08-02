package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            }

            System.out.print("Do you want to continue? (yes/no):");
            choice = scanner.next();
        } while (!choice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
