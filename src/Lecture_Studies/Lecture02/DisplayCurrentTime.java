package Lecture_Studies.Lecture02;

public class DisplayCurrentTime {
    public static final int Istanbul_GMT = 3;

    public static void main(String[] args) throws Exception {
        while (true) {
            long elapsed = System.currentTimeMillis();
            long today = elapsed % (1000 * 60 * 60 * 24);

            int hour = (int) today / (1000 * 60 * 60);
            today -= hour * (1000 * 60 * 60);
            int minute = (int) today / (1000 * 60);
            today -= minute * (100 * 60);
            int second = (int) today / (1000 * 60);

            System.out.printf("Current time is %d:%d:%d\n", hour + Istanbul_GMT, minute, second);
            Thread.sleep(1000);
        }
    }
}
