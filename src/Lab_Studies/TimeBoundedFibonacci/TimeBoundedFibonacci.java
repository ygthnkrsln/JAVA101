package Lab_Studies.TimeBoundedFibonacci;

public class TimeBoundedFibonacci {
    private int timeLimit;

    public TimeBoundedFibonacci() {
        this.timeLimit = 100;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public long fibonacci(int n) {
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void run() {
        int fibNum = 0;

        while (true) {
            long startTime = System.currentTimeMillis();
            long fibN = fibonacci(fibNum);
            long timeElapsed = System.currentTimeMillis() - startTime;

            if (timeElapsed >= timeLimit) {
                System.out.println("The limit has been reached.\n");
                break;
            }

            System.out.printf("fibonacci(%d) = %d \t This function is computed in %d ms\n", fibNum, fibN, timeElapsed);
            fibNum++;
        }
    }
}
