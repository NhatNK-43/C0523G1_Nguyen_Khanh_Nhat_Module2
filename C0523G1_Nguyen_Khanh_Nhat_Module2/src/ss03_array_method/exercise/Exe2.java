package ss03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {15, 6, 3, 8, 5};
        System.out.println("Array created: " + Arrays.toString(arr));

        int index;
        do {
            System.out.print("Enter the position to be insert: ");
            index = scanner.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("0 <= index <= " + arr.length);
            }
        } while (index < 0 || index > arr.length);

        System.out.print("Enter the value to be insert: ");
        int number = scanner.nextInt();
        System.out.println("Array after insert: " + Arrays.toString(insertElement(index, number, arr)));
    }

    static int[] insertElement(int index, int number, int[] arr) {
        int[] arrResult = new int[arr.length + 1];
        System.arraycopy(arr, 0, arrResult, 0, arr.length);
        for (int i = arrResult.length - 1; i > index; i--) {
            arrResult[i] = arrResult[i - 1];
        }
        arrResult[index] = number;
        return arrResult;
    }
}
