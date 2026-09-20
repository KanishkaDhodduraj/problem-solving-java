//Problem 2 — Reverse a Number
//
//Pattern: Number manipulation
//Difficulty: Easy
//
//Reverse the digits of a given integer.
//
//        Example
//
//Input: 12345
//Output: 54321
//
//Test cases
//
//12345 → 54321
//        908 → 809
//        1000 → 1
//        7 → 7

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNum(int n) {
        int reversed = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int result = reverseNum(num);
        System.out.println("Reversed Number : " + result);

        sc.close();
    }
}