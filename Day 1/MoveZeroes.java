//Problem 7 — Move Zeros to the End
//
//Pattern: Array manipulation
//Difficulty: Medium
//
//Move all 0s to the end while maintaining the relative order of the non-zero elements.
//
//Example
//
//Input:
//        [0, 1, 0, 3, 12]
//
//Output:
//        [1, 3, 12, 0, 0]
//
//Test cases
//
//[0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]
//
//        [1, 2, 3] → [1, 2, 3]
//
//        [0, 0, 1] → [1, 0, 0]
//
//        [0, 0, 0] → [0, 0, 0]

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
            return nums;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = moveZeroes(arr);

        System.out.println("Output: " + Arrays.toString(result));
        sc.close();
        }
    }