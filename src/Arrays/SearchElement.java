package Arrays;

import java.util.Scanner;

public class SearchElement {
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
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int element : arr) {
            if (element == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " exists in the array.");
        } else {
            System.out.println(target + " does not exist in the array.");
        }

        sc.close();
    }
}
