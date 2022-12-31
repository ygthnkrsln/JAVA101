package Lecture_Studies.Lecture05;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city e.g., New York: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city e.g., Boston: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0) System.out.println("The cities in alphabetical order are " +
                city1 + "," + city2);
        else System.out.println("The cities in alphabetical order are " +
                city2 + "," + city1);
    }
}
