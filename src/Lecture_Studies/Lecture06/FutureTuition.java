package Lecture_Studies.Lecture06;

import java.util.Scanner;

public class FutureTuition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a tuition: ");
        double tuition = input.nextInt();
        double doubleTuition = tuition * 2;
        int year = 0;

        while (tuition < doubleTuition) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}
