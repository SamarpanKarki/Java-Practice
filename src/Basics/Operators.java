package Basics;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((double)a / b));
        System.out.println("Remainder: " + (a % b));


        // Logical Operators
        System.out.println("\n--- Logical Operations ---");

        System.out.println("Is first number greater than second? " + (a > b));
        System.out.println("Is first number equal to second? " + (a == b));
        System.out.println("Are both numbers positive? " + (a > 0 && b > 0));
        System.out.println("Is either number positive? " + (a > 0 || b > 0));


        input.close();
    }
}