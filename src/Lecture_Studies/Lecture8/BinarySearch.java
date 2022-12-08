package Lecture_Studies.Lecture8;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int n) {
        int low = 0;
        int high = array.length;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (array[mid] == n) return mid;
            else if (n > array[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 5, 19, 26, 30, 1, 49, 93, 8, 12, -9, -19, -5};
        int[] testValues = new int[]{10, 13, 5, 8};

        Arrays.sort(testArray);
        System.out.println("The array can be visualized as " + Arrays.toString(testArray));

        for (int t : testValues) {
            int pos = binarySearch(testArray, t);

            if (pos == -1) System.out.println("Sorted array does not contain " + t);
            else System.out.printf("Sorted array contains %d at index %d\n", t, pos);
        }
    }

}
