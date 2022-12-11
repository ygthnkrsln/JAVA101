package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortByHeight {
    //Yiğithan KARAASLAN 32813013854

    public static String[] sortByHeight(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = temp;

            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }

        System.out.println("Sorted names: " + Arrays.toString(names));
        System.out.println("Sorted heights: " + Arrays.toString(heights));

        return names;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names should be included in the array? ");
        int n = input.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.print("Enter name: ");
            names[i] = input.nextLine();
            System.out.print("Enter height: ");
            heights[i] = input.nextInt();
        }

        System.out.println("Names before sorting: " + Arrays.toString(names));
        System.out.println("Heights before sorting: " + Arrays.toString(heights) + "\n");
        sortByHeight(names, heights);
    }
}
