//Problem 3 — Palindrome Number
//
//Pattern: Reverse + comparison
//Difficulty: Easy
//
//Check whether a number reads the same from left to right and right to left.
//
//        Example
//
//Input: 121
//Output: true
//
//Test cases
//
//121 → true
//        123 → false
//        1221 → true
//        100 → false
//        7 → true

import java.util.Scanner;


public class Palindrome {

    static boolean isPalindrome(int n) {
        int reversed = 0;
        int original = n;

        if(n < 0) {
            return false;
        }
        while(n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}