package Lecture_Studies.Lecture8;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if (currentMin != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 5, 19, 26, 30, 1, 49, 93, 8, 12, -9, -19, -5};

        System.out.println("The array can be visualized as " + Arrays.toString(testArray));
        selectionSort(testArray);
        System.out.println("The sorted array can be visualized as " + Arrays.toString(testArray));
    }
}
