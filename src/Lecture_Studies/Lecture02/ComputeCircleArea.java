package Lecture_Studies.Lecture02;

public class ComputeCircleArea {

    public static void main(String[] args) {
        double radius = 3;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle's area with %.2f radius is: %.2f", radius, area);
    }
}
