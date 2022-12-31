package Lecture_Studies.Lecture03;

import java.util.Scanner;

public class ImprovedMathLearning {
    static Scanner input = new Scanner(System.in);

    public static void add(int a, int b) {
        System.out.printf("What is %d + %d ?\n", a, b);

        while (true) {
            int answerAdd = input.nextInt();

            if (answerAdd == a + b) {
                System.out.println("Correct!");
                break;
            } else System.out.println("False! Let's give another try.");
        }
    }

    public static void sub(int a, int b) {
        System.out.printf("What is %d - %d ?\n", a, b);

        while (true) {
            int answerSub = input.nextInt();

            if (answerSub == a - b) {
                System.out.println("Correct!");
                break;
            } else System.out.println("False! Let's give another try.");
        }
    }

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("1: Addition, 2: Subtraction" + "\nWhich type of question do you want?");
        int answerType = input.nextInt();

        if (answerType == 1) add(a, b);
        else if (answerType == 2) sub(a, b);
        else System.out.println("Please enter valid value. The value should be 1 or 2. ");
    }
}
