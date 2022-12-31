package Lecture_Studies.Lecture06;

public class SwapPassByValue {
    public static void swap(int num1, int num2) {
        System.out.println("Number 1 is: " + num1 + "\nNumber 2 is: " + num2 + "\n" + "\nSwapping..." + "\n");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number 1's new value is: " + num1 + "\nNumber 2's new value is: " + num2);
    }

    public static void main(String[] args) {
        int num1 = (int) ((Math.random() * 100));
        int num2 = (int) ((Math.random() * 100));

        swap(num1, num2);

        System.out.println("\nAfter invoking swap method, Number 1 is: " + num1 + " Number 2 is: " + num2);
    }
}
