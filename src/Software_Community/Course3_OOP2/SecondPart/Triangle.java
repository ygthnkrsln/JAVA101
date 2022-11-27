package Software_Community.Course3_OOP2.SecondPart;

public class Triangle extends Polygonal {
    public Triangle(double[] sides) {
        super(sides);
    }

    @Override
    public double calculateArea() {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double s = (a + b + c) / 2.0d;
        double Area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        return Area;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
