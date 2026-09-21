//Problem 6 — Second Largest Element
//
//Pattern: Array traversal
//Difficulty: Easy → Medium
//
//Given an array, find the second largest distinct element.
//
//Example
//
//Input:
//        [10, 5, 20, 8, 20]
//
//Output:
//        10
//
//Because the largest distinct value is 20, the second largest is 10.
//
//Test cases
//
//[10, 5, 20, 8] → 10
//        [10, 20, 20, 5] → 10
//        [5, 5, 5, 3] → 3
//        [1, 9, 4, 7] → 7

import java.util.Scanner;

public class SecondLargest {

    public static int isSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
            if (secondMax == Integer.MIN_VALUE) {
                return -1;
            }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

            int result = isSecondLargest(arr);

            System.out.println("Second Largest : " + result);
            sc.close();
        }
    }