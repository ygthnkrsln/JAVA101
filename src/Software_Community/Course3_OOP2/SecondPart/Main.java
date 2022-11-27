package Software_Community.Course3_OOP2.SecondPart;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new double[]{3, 4, 5});
        Shape rectangle = new Rectangle(new double[]{10, 5});
        Shape square = new Rectangle(new double[]{12, 12});
        Shape circle = new Circle(8);

        printShape(triangle);
        printShape(rectangle);
        printShape(square);
        printShape(circle);

        System.out.println(triangle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);
    }

    public static void printShape(Shape shape) {
        System.out.println("Area of " + shape.getName() + " is " + shape.calculateArea());
        System.out.println("Perimeter of " + shape.getName() + " is " + shape.calculatePerimeter());
    }
}
