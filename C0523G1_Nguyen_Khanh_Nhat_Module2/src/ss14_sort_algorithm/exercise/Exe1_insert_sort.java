package ss14_sort_algorithm.exercise;

import java.util.Arrays;

public class Exe1_insert_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 7, 9, 12, 14, 20, 27, 30, 54};
        System.out.println("Array created: " + Arrays.toString(arr));
        System.out.println("Length: " + arr.length);
        insertSort(arr);
    }

    private static void insertSort(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    break;
                }
                arr[j + 1] = arr[j];

                System.out.println("B" + count + ": " + Arrays.toString(arr));
                count++;
            }
            arr[j + 1] = temp;

            System.out.println("B" + count + ": " + Arrays.toString(arr));
            count++;
        }
    }
}
