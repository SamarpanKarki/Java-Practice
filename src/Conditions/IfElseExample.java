package Conditions;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        input.close();
    }
}
