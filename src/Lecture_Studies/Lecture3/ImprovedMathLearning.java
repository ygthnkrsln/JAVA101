package Lecture_Studies.Lecture3;

import java.util.Scanner;

public class ImprovedMathLearning {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is %d - %d ?\n", a, b);
        int answer = scanner.nextInt();

        if (answer == a - b) System.out.println("Correct!");
        else System.out.println("False!");
    }
}
