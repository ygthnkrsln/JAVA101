package Lecture_Studies.Lecture5;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("*** " + i + " ***");

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d is %d // ", i, j, i * j);
            }
            System.out.println();

        }

    }
}
