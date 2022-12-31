package Lecture_Studies.Lecture08;

public class LinearSearch {
    public static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 5, 19, 26, 30, 1, 49, 93, 8, 12, -9, -19, -5};
        int[] testValues = new int[]{10, 13, 5, 8};

        for (int t : testValues) {
            int pos = linearSearch(testArray, t);

            if (pos == -1) System.out.println("Array does not contain " + t);
            else System.out.printf("Array contains %d at index %d\n", t, pos);
        }
    }
}
