package Lecture_Studies.Lecture3;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0 = Single filer, 1 = Married filing jointly or qualified widow(er), "
                + "2 = Married filing separately, 3 = Head of household" + "\nPlease enter your filing statue: ");
        int status = input.nextInt();

        System.out.println("Please enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.1 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25 + (income - 82250) * 28;
            else if (income <= 372950)
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25 + (income - 82250) * 28 +
                        (income - 171550) * 0.33;
            else
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25 + (income - 82250) * 28 +
                        (income - 171550) * 0.33 + (income - 372950) * 35;
            }

        else if (status == 1) {
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.1 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.1 + (income - 16700) * 0.15 +
                        (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 16700 * 0.1 + (income - 16700) * 0.15 +
                        (income - 67900) * 0.25 + (income - 137050) * 28;
            else if (income <= 372950)
                tax = 16700 * 0.1 + (income - 16700) * 0.15 +
                        (income - 67900) * 0.25 + (income - 137050) * 28 +
                        (income - 208850) * 0.33;
            else
                tax = 16700 * 0.1 + (income - 16700) * 0.15 +
                        (income - 67900) * 0.25 + (income - 137050) * 28 +
                        (income - 208850) * 0.33 + (income - 372950) * 35;
        }

        else if (status == 2) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.1 + (income - 8350) * 0.15;
            else if (income <= 68525)
                tax = 8350 * 0.1 + (income - 8350.0) * 0.15 +
                        (income - 33950) * 0.25;
            else if (income <= 104425)
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25 + (income - 68525) * 28;
            else if (income <= 186475)
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25 + (income - 68525) * 28 +
                        (income - 104425) * 0.33;
            else
                tax = 8350 * 0.1 + (income - 8350) * 0.15 +
                        (income - 33950) * 0.25 + (income - 68525) * 28 +
                        (income - 104425) * 0.33 + (income - 186475) * 35;
        }

        else if (status == 3) {
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 11950 * 0.1 + (income - 11950) * 0.15;
            else if (income <= 117450)
                tax = 11950 * 0.1 + (income - 11950) * 0.15 +
                        (income - 45500) * 0.25;
            else if (income <= 190200)
                tax = 11950 * 0.1 + (income - 11950) * 0.15 +
                        (income - 45500) * 0.25 + (income - 117450) * 28;
            else if (income <= 372950)
                tax = 11950 * 0.1 + (income - 11950) * 0.15 +
                        (income - 45500) * 0.25 + (income - 117450) * 28 +
                        (income - 190200) * 0.33;
            else
                tax = 11950 * 0.1 + (income - 11950) * 0.15 +
                        (income - 45500) * 0.25 + (income - 117450) * 28 +
                        (income - 190200) * 0.33 + (income - 372950) * 35;
        }

        else {
            System.out.println("Error: invalid status!");
            System.exit(1);
        }

        System.out.println("Tax is " + (int) (tax * 100) / 100.0);

    }
}
