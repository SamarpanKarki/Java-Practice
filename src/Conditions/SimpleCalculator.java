package Conditions;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        if (operator == '+')
            System.out.println("Answer = " + (a + b));
        else if (operator == '-')
            System.out.println("Answer = " + (a - b));
        else if (operator == '*')
            System.out.println("Answer = " + (a * b));
        else if (operator == '/')
            System.out.println("Answer = " + (a / b));
        else
            System.out.println("Invalid Operator");

        input.close();
    }
}