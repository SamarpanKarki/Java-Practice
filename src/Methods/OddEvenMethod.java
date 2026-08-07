package Methods;

import java.util.Scanner;

public class OddEvenMethod {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        if (isEven(number)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
