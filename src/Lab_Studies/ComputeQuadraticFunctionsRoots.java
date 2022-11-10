package Lab_Studies;

import java.util.Scanner;

public class ComputeQuadraticFunctionsRoots {
    public static void main(String[] args) {
        Scanner coefficient = new Scanner(System.in);
        System.out.println("Please enter coefficients: a for ax², b for bx and c to create a function like ax²+bx+c.");
        double a = coefficient.nextDouble();
        double b = coefficient.nextDouble();
        double c = coefficient.nextDouble();

        System.out.printf("Your function is: %.1fx²+%.1fx+%.1f\n",a ,b ,c);

        double D = (Math.pow(b, 2) - (4 * a * c));
        double root1 = ((-b + Math.sqrt(D)) / 2);
        double root2 = ((-b - Math.sqrt(D)) / 2);
        double rootDequal0 = -b / 2 * a;

        if (D > 0) {
            System.out.println("Your function has two real roots.");
            System.out.printf("First root is %.2f and second root is %.2f", root1, root2);
        }

        else if (D < 0) {
            System.out.println("Your function has no real roots.");
            System.exit(0);
        }

        else System.out.printf("Your function has one real root which is equal to %.2f.", rootDequal0);
    }
}
