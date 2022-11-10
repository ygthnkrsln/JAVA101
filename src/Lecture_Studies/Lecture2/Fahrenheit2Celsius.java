package Lecture_Studies.Lecture2;

import java.util.Scanner;

public class Fahrenheit2Celsius {

    public static void main(String[] args) {
        Scanner F2C = new Scanner(System.in);
        System.out.println("Please enter a value in Fahrenheit:");

        double Fahrenheit = F2C.nextDouble();
        double Celsius = (5d/9)*(Fahrenheit - 32);

        System.out.printf("%.2f Fahrenheit is equal to %.2f", Fahrenheit, Celsius);

    }
}
