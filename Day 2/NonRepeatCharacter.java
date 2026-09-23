//Problem 8 — First Non-Repeating Character
//
//Pattern: String + frequency counting
//Difficulty: Medium
//
//Given a string, find the first character that appears only once.
//
//Example
//
//Input:
//swiss
//
//Output:
//w
//
//Because:
//
//s → 3 times
//w → 1 time
//i → 1 time
//
//w appears first among the non-repeating characters.
//
//Test cases
//
//swiss → w
//aabbc → c
//programming → p
//aabb → -1
//abcdef → a

import java.util.Scanner;

public class NonRepeatCharacter {

    public static String nonRepeatingChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return String.valueOf(ch);
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        String result = nonRepeatingChar(str);

        System.out.println("Non Repeating Character is : " + result);
        sc.close();
    }
}