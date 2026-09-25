//Prime Number
//
//Pattern: Basic mathematical logic
//Difficulty: Easy
//
//Check whether a given number is prime.
//
//Example
//Input: 17
//Output: true
//Test cases
//2 → true
//7 → true
//17 → true
//10 → false
//1 → false
//25 → false

import java.util.Scanner;

public class PrimeNumer {
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        if(n == 2) {
            return true;
        }

        if(n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}