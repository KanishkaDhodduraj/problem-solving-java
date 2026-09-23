//Problem 9 — Missing Number
//
//Pattern: Array + mathematical logic
//Difficulty: Medium
//
//An array contains numbers from 1 to n, but exactly one number is missing. Find it.
//
//Example
//
//Input:
//        [1, 2, 4, 5]
//
//n = 5
//
//Output:
//        3
//
//Test cases
//
//[1, 2, 4, 5] → 3
//        [1, 2, 3, 5] → 4
//        [2, 3, 4, 5] → 1
//        [1, 2, 3, 4] → 5
//
//Try not to use sorting.


import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum = actualSum + num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size - 1];
        System.out.println("Enter the elements");
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMissingNumber(arr, size);

        System.out.println("Missing number : " + result);
        sc.close();
    }
}