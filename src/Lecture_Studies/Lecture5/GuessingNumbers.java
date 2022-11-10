package Lecture_Studies.Lecture5;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);

        Scanner guessing = new Scanner(System.in);
        System.out.println("Guess my number: ");

        while (true) {
            int answer = guessing.nextInt();

            if (answer == number) {
                System.out.println("Correct! You found my number.");
                break;
            } else if (answer < number) {
                System.out.println("It's too low, let's give another try.");
            } else {
                System.out.println("It's too high, let's give another try.");
            }

        }
    }
}
