package Lecture_Studies.Lecture9;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 =  new Circle(5.0);

        double r = c1.getRadius();
        System.out.println(r);

        double area = c1.getArea();
        System.out.println(area);

        c1.setRadius(18);
        System.out.println(c1.getRadius());

        area = c1.getArea();
        System.out.println(area);
    }
}
