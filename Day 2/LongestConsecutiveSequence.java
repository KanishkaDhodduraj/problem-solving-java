//Problem 10 — Company-Style Challenge
//Find the Longest Consecutive Sequence
//
//Pattern: Array + logic
//Difficulty: Medium
//
//Given an array of integers, find the length of the longest sequence of consecutive numbers.
//
//Example
//
//Input:
//        [100, 4, 200, 1, 3, 2]
//
//Output:
//        4
//
//Because:
//
//        1, 2, 3, 4
//
//is the longest consecutive sequence.
//
//        Test cases
//
//[100, 4, 200, 1, 3, 2] → 4
//
//        [1, 2, 3, 4, 5] → 5
//
//        [10, 5, 12, 3, 55, 4, 11, 2] → 4
//
//        [7] → 1
//
//        [1, 3, 5, 7] → 1

import java.util.Scanner;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }


        int maxLength = 0;

        for(int num : nums) {
            if(!set.contains(num - 1)) {
                int currNum = num;
                int currLength = 1;

                while (set.contains(currNum + 1)) {
                    currNum += 1;
                    currLength += 1;
                }

                    maxLength = Math.max(maxLength, currLength);

                }
            }

            return maxLength;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = longestConsecutive(arr);

        System.out.println("Longest Consecutive Sequence : " + result);
        sc.close();
    }
}