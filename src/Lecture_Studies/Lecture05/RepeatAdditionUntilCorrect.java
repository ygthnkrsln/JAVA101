package Lecture_Studies.Lecture05;

import java.util.Scanner;

public class RepeatAdditionUntilCorrect {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is %d + %d ? ", a, b);

        while (true) {
            int answer = scanner.nextInt();

            if (answer == a + b) {
                System.out.println("Correct!");
                break;
            } else System.out.println("False, let's give another try.");
        }
    }
}
