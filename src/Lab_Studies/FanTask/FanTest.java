package Lab_Studies.FanTask;

public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(10.0);
        fan1.setOn(true);
        fan1.setColor("purple");

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(3);
        fan2.setOn(true);
        fan2.setColor("pink");

        Fan fan3 = new Fan();
        fan3.setSpeed(Fan.FAST);

        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }
}
