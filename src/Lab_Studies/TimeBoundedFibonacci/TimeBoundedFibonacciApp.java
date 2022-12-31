package Lab_Studies.TimeBoundedFibonacci;

public class TimeBoundedFibonacciApp {
    public static void main(String[] args) {
        TimeBoundedFibonacci tbf = new TimeBoundedFibonacci();

        System.out.printf("Running app with time limit %d milliseconds\n", tbf.getTimeLimit());
        System.out.println("------------------------------------------------------------------");
        tbf.run();

        tbf.setTimeLimit(300);
        System.out.printf("Running app with time limit %d milliseconds\n", tbf.getTimeLimit());
        System.out.println("------------------------------------------------------------------");
        tbf.run();
    }
}
