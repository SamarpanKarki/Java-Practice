package Methods;

import java.util.Scanner;

public class FactorialMethod {

    static long factorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long result = factorial(number);

        if (result != -1) {
            System.out.println("Factorial of " + number + " is: " + result);
        }

        sc.close();
    }
}