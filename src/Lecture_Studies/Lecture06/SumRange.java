package Lecture_Studies.Lecture06;

public class SumRange {
    public static int sum(int n1, int n2) {
        int sum = 0;

        for (int i = n1; i < n2; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 13 is: " + sum(1, 13));
        System.out.println("Sum from 17 to 38 is: " + sum(17, 38));
        System.out.println("Sum from 35 to 59 is: " + sum(35, 59));
    }
}
