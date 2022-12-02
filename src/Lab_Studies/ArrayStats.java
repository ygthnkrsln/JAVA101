package Lab_Studies;

import java.util.Arrays;

public class ArrayStats {
    public static int[] initRandomArray() {
        int[] array = new int[(int) ((Math.random() * 20) + 1)];

        for (int i = 0; i < array.length; i++) array[i] = (int) ((Math.random() * 20) + 1);

        return array;
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int a : array) if (a > max) max = a;

        return max;
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int a : array) if (a < min) min = a;

        return min;
    }

    public static double getMean(int[] array) {
        double sum = 0;

        for (int a : array) sum += a;

        return sum / array.length;
    }

    public static int getHigherThanAvgCount(int[] array) {
        int higherThanAvgCount = 0;
        for (int a : array) if (a > getMean(array)) higherThanAvgCount++;
        return higherThanAvgCount;
    }

    public static void main(String[] args) {
        System.out.println("Initializing a random array.");
        int[] randomArray = initRandomArray();

        System.out.println("Elements of array are: " + Arrays.toString(randomArray));

        int length = randomArray.length;
        System.out.println("Array's length is: " + length);

        int max = getMax(randomArray);
        System.out.println("Maximum of the array is: " + max);

        int min = getMin(randomArray);
        System.out.println("Minimum of the array is: " + min);

        double mean = getMean(randomArray);
        System.out.printf("Mean of the array is: %.2f\n", mean);

        int higherThanAvgCount = getHigherThanAvgCount(randomArray);
        System.out.println("The amount of elements which are higher than mean: " + higherThanAvgCount);
    }

}
