//Problem 5 — Find the Largest Digit
//
//Pattern: Traversing digits
//Difficulty: Easy
//
//Find the largest digit present in a number.
//
//Example
//
//Input: 58329
//Output: 9
//
//Test cases
//
//58329 → 9
//        12345 → 5
//        90001 → 9
//        777 → 7

import java.util.Scanner;

public class LargestDigit {

    public static int largestDigit(int n) {
        int maxDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n = n / 10;
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int num = sc.nextInt();

        int result = largestDigit(num);
        System.out.println("Largest Digit :" + result);
        sc.close();
    }
}