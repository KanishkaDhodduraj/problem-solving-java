//Problem 4 — Count Even and Odd Digits
//
//Pattern: Digit traversal
//Difficulty: Easy
//
//Given a number, count how many digits are even and how many are odd.
//
//        Example
//
//Input: 58321
//
//Even digits: 2
//Odd digits: 3
//
//Test cases
//
//58321 → Even: 2, Odd: 3
//        2468 → Even: 4, Odd: 0
//        1357 → Even: 0, Odd: 4
//        1002 → Even: 3, Odd: 1

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }

        System.out.println("Even : " + evenCount);
        System.out.println("Odd : " + oddCount);

        sc.close();
    }
}