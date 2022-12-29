package Lecture_Studies.Lecture10;

public class RecursiveFibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("fibonacci(%d) = %d\n", i, fib(i));
        }
    }
}
