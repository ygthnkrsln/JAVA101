package Software_Community.Course1_101;

import java.util.Arrays;

public class Course1 {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter an integer. ");
//        int number1 = input.nextInt();

//        while(number1 < 5) {  //Durdurulana kadar, şart sağlandığında alttaki kodu yazmayı sağlar.
//            System.out.println(number1);
//            number1 = number1 + 1;
//        }

//        for (int i = 0; i < number1; i++) {
//            System.out.println(i);
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter an integer.");
//        for (int i = 0; i < 5; i++) {
//            int n = input.nextInt();
//            if (n % 2 == 0)
//                System.out.println("Even");
//            else {
//                System.out.println("Odd");
//                continue;
//            }
//            System.out.println("Loop ended.");
//        }

//        int number = add(4, 5);
//        System.out.println(number);
//
//    }
//
//    static int add(int  n1, int n2) {
//        return n1 + n2;

//        int[] array = new int[5];
//        int[] array2 = {1, 2, 3};
//
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter " + i + " element of array: ");
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        int [][] array2 = new int[4][3];
//        System.out.println(array2.length);
//        System.out.println(array2[2].length);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter repeat time: ");
//        int r = scanner.nextInt();


        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int red = (int) (Math.random() * 21);
        int blue = (int) (Math.random() * 21);
        int temp;
        temp = array[red];
        array[red] = array[blue];
        array[blue] = temp;

        System.out.println(Arrays.toString(array));

    }
}
