package Strings;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        int wordCount = sentence.isEmpty() ? 0 : sentence.split("\\s+").length;

        System.out.println("Number of words: " + wordCount);
        sc.close();
    }
}
