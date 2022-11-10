package Lecture_Studies.Lecture3;

import java.util.Scanner;

public class SimpleMathLearning {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is %d + %d ? ", a, b);
        int answer = scanner.nextInt();

        if (answer == a + b) System.out.println("Correct! ");
        else System.out.println("False! ");
    }
}
