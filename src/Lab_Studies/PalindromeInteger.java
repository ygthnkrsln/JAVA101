package Lab_Studies;

import java.util.Scanner;

public class PalindromeInteger {
    public static int reverse(int num) {
        int reverseNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverseNum);
        return reverseNum;
    }

    public static boolean isPalindrome(int num) {
        if (num == reverse(num)) System.out.printf("%d is palindrome.", num);
        else System.out.printf("%d is not palindrome.", num);

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("   ");
        System.out.println("Your number is: " + num);

        isPalindrome(num);
    }
}
