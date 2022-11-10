package Personal_Studies;

import java.util.Scanner;

public class EdomStockCalculator {

    public static void main(String[] args) {
        System.out.println("Please enter your stock informations in order which is shown. Order: Q1-Q2-Q3-Q4-Q5-EB");

        Scanner scanner = new Scanner(System.in);
        int Q1AD = scanner.nextInt();
        int Q2AD = scanner.nextInt();
        int Q3AD = scanner.nextInt();
        int Q4AD = scanner.nextInt();
        int Q5AD = scanner.nextInt();
        int EB = scanner.nextInt();

        double TOTAL = (double) (Q1AD * 400 + Q2AD * 800 + Q3AD * 1200 + Q4AD * 1600 + Q5AD * 2000 + EB * 100) / 10000;

        System.out.printf("Your stock amount is: %.2fk", TOTAL);

    }

}
