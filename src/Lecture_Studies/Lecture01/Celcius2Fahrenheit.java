package Lecture_Studies.Lecture01;

public class Celcius2Fahrenheit {
    public static void main(String[] args) {

        double celcius = 35.0;
        double fahrenheit = ((double) 9 / 5) * celcius + 32;

        System.out.printf("%.2f Celcius = %.2f Fahrenheit", celcius, fahrenheit);
    }
}
