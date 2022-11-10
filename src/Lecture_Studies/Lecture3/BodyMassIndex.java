package Lecture_Studies.Lecture3;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms and height in meters: ");
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double BMI = weight / Math.pow(height, 2);

        String status;

        if (BMI < 18.5)
            status = "underweight";
        else if (BMI < 25.0)
            status = "normal";
        else if (BMI < 30.0)
            status = "overweight";
        else
            status = "obese";

        System.out.printf("Calculated BMI = %.2f\n", BMI);
        System.out.println("You are: " + status);

    }
}
