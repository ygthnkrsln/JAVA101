package Lecture_Studies.Lecture02;

import java.util.Scanner;

public class Seconds2Minutes {

    public static void main(String[] args) {
        Scanner S2M = new Scanner(System.in);
        System.out.println("Please enter a value in seconds: ");
        int totalsec = S2M.nextInt();

        int minutes = totalsec / 60;
        int seconds = totalsec % 60;

        System.out.printf("%d seconds is equal to %d minutes and %d seconds.", totalsec, minutes, seconds);

    }
}
