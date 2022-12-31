package Lecture_Studies.Lecture03;

import java.util.Scanner;

public class DeterminingLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year to evaluate if it is a leap year or not: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.printf("%d is a leap year.", year);
        else System.out.printf("%d is not a leap year.", year);
    }
}
