package Lab_Studies;

public class RecursiveFibonacciWithTimeLimit {
    public static int fib(int n) {
        if (n <= 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int fibNum = 0;

        while (true) {
            long startTime = System.currentTimeMillis();

            fib(fibNum);
            long endTime = System.currentTimeMillis();
            long computeTime = (endTime - startTime);

            if (computeTime >= 100) {
                System.out.println("The limit has been reached.");
                break;
            }

            System.out.printf("fib(%d) = %d \t This function is computed in %d ms\n", fibNum, fib(fibNum), computeTime);
            fibNum++;
        }
    }
}
