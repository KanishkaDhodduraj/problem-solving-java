//Count Digits
//
//Pattern: Number manipulation
//Difficulty: Easy
//
//Given an integer n, count the number of digits.
//
//Examples
//Input: 58321
//Output: 5
//Test cases
//58321 → 5
//        7 → 1
//        1000 → 4
//        99999 → 5
//
//Java method:
//
//static int countDigits(int n) {
//
//}

import java.util.Scanner;

public class Count {
    public static int countDigits(int n) {
        int count++;
        for(int i = 0; i < n; i++) {
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer: ");
         int num = sc.nextInt();

         int result = countDigits(num);

         System.out.println("Count : " + result);
         sc.close();
    }
}