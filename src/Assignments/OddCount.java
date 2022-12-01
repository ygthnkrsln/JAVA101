package Assignments;

import java.util.Scanner;

public class OddCount {

    public static void loopBasedCount(int a, int b) {
        int oddCount = 0;

        for (int num = a; num <= b; num++) {
            if (num % 2 != 0) oddCount++;
        }

        System.out.printf("\nLoop-based solution: The number of odds in range [%d,%d] = %d", a, b, oddCount);
    }

    public static void mathBasedCount(int a, int b) {
        int oddCount;

        if (a % 2 == 0 && b % 2 == 0) oddCount = ((b - a) / 2);
        else oddCount = (((b - a) / 2) + 1);

        System.out.printf("\nMath-based solution: The number of odds in range [%d,%d] = %d", a, b, oddCount);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integer to create a closed interval: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;

            System.out.printf("The closed interval is [%d,%d]\n", a, b);
            System.out.println("    ");

        } else System.out.printf("The closed interval is [%d,%d]\n", a, b);

        long beforeLoopBasedMethod = System.currentTimeMillis();
        loopBasedCount(a, b);
        long afterLoopBasedMethod = System.currentTimeMillis();

        System.out.println("\nLoop-based method takes " + (afterLoopBasedMethod - beforeLoopBasedMethod) + " milliseconds.");

        long beforeMathBasedMethod = System.currentTimeMillis();
        mathBasedCount(a, b);
        long afterMathBasedMethod = System.currentTimeMillis();

        System.out.println("\nMath-based method takes " + (afterMathBasedMethod - beforeMathBasedMethod) + " milliseconds.");
    }
}
