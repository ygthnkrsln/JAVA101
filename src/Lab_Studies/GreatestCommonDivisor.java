package Lab_Studies;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = (int) ((Math.random() * 1000) + 1);
        int B = (int) ((Math.random() * 1000) + 1);
        int GCD;
        System.out.println("Random 1 is: " + A + "\tRandom 2 is: " + B);


        String BruteForce = "A";
        String Euclidean = "B";

        System.out.println("Random integers are (" + A + "," + B + ") and and you are expected to find GCD for these integers. " +
                "Write the path you want to follow: (A: Brute-Force Algorithm B: Euclidean Algorithm)");

        String choice = scanner.nextLine();

        if (choice.equals(BruteForce)) {

            System.out.println("You are going to calculate GCD(" + A + "," + B + ") with Brute-Force Algorithm.");

            for (int BF_divisor = 1; BF_divisor <= B; BF_divisor++) {

                if (A % BF_divisor == 0 && B % BF_divisor == 0) {
                    GCD = BF_divisor;

                    System.out.printf("GCD(%d,%d) is: %d ", A, B, GCD);
                }
            }
        }

        if (choice.equals(Euclidean)) {

            if (A < B) {
                int temp = A;
                A = B;
                B = temp;
            }

            int K = A % B;

            System.out.println("You are going to calculate GCD(" + A + "," + B + ") with Euclidean Algorithm. ");

            while (K != 0) {
                A = B;
                B = K;
                K = A % B;
            }

            System.out.println("These integer's GCD is: " + B);
        }
    }
}
