package Assignments;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        Scanner overall = new Scanner(System.in); //This code is used to create a Scanner.

        System.out.println("Please enter the overall score: "); //This code prints "Please enter your grade!" sentence to the screen.
        double Overall_score = overall.nextDouble(); //This code is used to take an input from the user.

        if (Overall_score == -0 || Overall_score < 0 ) { //This code creates a condition about input's value. Because input should be 0 or positive. Also, this code blocks user giving input whose value is -0.
            System.out.println("Please enter valid value, your grade can't be minus zero or negative!");
            System.exit(0); //If input is negative, this code terminates the system.
        }

        if (Overall_score > 100) { //This code blocks giving input whose value is more than 100.
            System.out.println("Your score can't be more than 100. Please enter valid value.");
            System.exit(0);
        }

        if (Overall_score < 50) { //This code creates a condition as well. If your overall score is less than or equal to 50, your grade and your succession appears on the screen.
            System.out.printf("Score: %.2f\tGrade: FF\tState: Failed.", Overall_score);
        }

        else if (Overall_score < 60) { //If the condition above doesn't be provided, this condition begins being valid.
            System.out.printf("Score: %.2f\tGrade: DD\tState: Passed.", Overall_score);
        }

        else if (Overall_score < 65) {
            System.out.printf("Score: %.2f\tGrade: DC\tState: Passed.", Overall_score);
        }

        else if (Overall_score < 70) {
            System.out.printf("Score: %.2f\tGrade: CC\tState: Passed.", Overall_score);
        }

        else if (Overall_score < 75) {
            System.out.printf("Score: %.2f\tGrade: CB\tState: Passed.", Overall_score);
        }

        else if (Overall_score < 80) {
            System.out.printf("Score: %.2f\tGrade: BB\tState: Passed.", Overall_score);
        }

        else if (Overall_score < 85) {
            System.out.printf("Score: %.2f\tGrade: BA\tState: Passed.", Overall_score);
        }

        else if (Overall_score < 90) {
            System.out.printf("Score: %.2f\tGrade: AB\tState: Passed.", Overall_score);
        }

        else if (Overall_score <= 100) {
            System.out.printf("Score: %.2f\tGrade: AA\tState: Passed. Well done!", Overall_score);
        }

    }

}
