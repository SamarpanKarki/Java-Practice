package Methods;

import java.util.Scanner;
public class LargestNumberMethod {
    static int LargestNum ( int a, int b, int c ){
        if( a > b && a > c ){
            return a;
        } else if ( b > a && b > c ){
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();
        int largest = LargestNum( a,b,c);
        System.out.println("Largest number is : " + largest);
    }
}
