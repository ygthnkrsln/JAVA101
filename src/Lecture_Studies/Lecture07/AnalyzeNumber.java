package Lecture_Studies.Lecture07;

import java.util.Scanner;

public class AnalyzeNumber {

    public static int[] getRandomArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }

    public static double getAverage(int[] array) {
        double sum = 0;

        for (int a : array) sum += a;

        return sum / array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
    }

    public static int countGreaterThanAvg(int[] array, double avg) {
        int result = 0;

        for (int a : array) {
            if (a > avg) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements should be in the array? Enter an integer: ");
        int n = input.nextInt();

        int[] myArray = getRandomArray(n);
        printArray(myArray);

        double avg = getAverage(myArray);
        System.out.println("\nAverage = " + avg);

        int greaterThanAvg = countGreaterThanAvg(myArray, avg);
        System.out.println("\nNumber of elements greater than avg. = " + greaterThanAvg);
    }

}
