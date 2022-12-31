package Lecture_Studies.Lecture02;

import java.util.Scanner;

public class ComputeCircleAreaWithInput {

    public static void main(String[] args) {
        Scanner Circle = new Scanner(System.in);
        System.out.println("Please enter a circle radius: ");

        double radius = Circle.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Your circle area with radius %.2f is %.2f", radius, area);
    }
}
