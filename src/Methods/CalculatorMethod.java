package Methods;

import java.util.Scanner;

public class CalculatorMethod {
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double a = sc.nextDouble();
        System.out.println("Enter second number : ");
        double b = sc.nextDouble();
        System.out.println("Enter Operator ( + - * / ) : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                double sum = add(a, b);
                System.out.println("Sum of two numbers : " + sum);
                break;
            case '-':
                double difference = subtract(a, b);
                System.out.println("Difference of two numbers : " + difference);
                break ;
            case '*':
                double product = multiply(a, b);
                System.out.println("Product of two numbers : " + product);
                break ;
            case '/':
                if (b == 0){
                    System.out.println("Not divisible by zero");
                } else{
                double quotient = divide(a, b);
                System.out.println("Quotient of two numbers : " + quotient);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
