package Lecture_Studies.Lecture03;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int integer = scanner.nextInt();

        if (integer % 2 == 0) System.out.println("Hieven! ");
        if (integer % 5 == 0) System.out.println("Hifive! ");
    }
}
