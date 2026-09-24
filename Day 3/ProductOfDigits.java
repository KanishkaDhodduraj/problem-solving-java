//Product of Digits
//
//Pattern: Digit manipulation
//Difficulty: Easy
//
//Find the product of all digits of a number.
//
//        Example
//Input: 234
//Output: 24
//
//Because:
//
//        2 × 3 × 4 = 24
//Test cases
//234 → 24
//        1234 → 24
//        505 → 0
//        7 → 7
//        1111 → 1



import java.util.Scanner;

public class ProductOfDigits {
    public static int productOfDigits(int n) {
        int product = 1;
        for(int i = 0; i < n; i++) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer: ");
        int num = sc.nextInt();

        int result = productOfDigits(num);

        System.out.println("Product : " + result);
        sc.close();
    }
}