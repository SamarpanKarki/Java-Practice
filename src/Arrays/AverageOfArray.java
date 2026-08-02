package Arrays;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        double sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = sum / n;

        System.out.println("Average: " + average);

        sc.close();
    }
}
