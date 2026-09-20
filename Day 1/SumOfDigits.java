//Problem 1 — Sum of Digits
//
//Pattern: Basic number manipulation
//Difficulty: Easy
//
//Given an integer n, find the sum of its digits.
//
//        Example
//
//Input:  5832
//Output: 18
//
//Test cases
//
//5832 → 18
//        12345 → 15
//        9001 → 10
//        7 → 7
//        10000 → 1
//

import java.util.Scanner;
public class SumOfDigits{

        static int sumOfDigits(int n) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            return sum;
        }

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Enter the number: ");
                    int num = sc.nextInt();

                    int result = sumOfDigits(num);

                    System.out.println("Sum of the digits are : " + result);
                    sc.close();
                }
            }