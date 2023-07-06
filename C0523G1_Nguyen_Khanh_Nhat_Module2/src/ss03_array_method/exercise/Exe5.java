package ss03_array_method.exercise;

import java.util.Arrays;

public class Exe5 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 7, 8, 12, 54, 3, -5, 4};

        System.out.println("Array created: " + Arrays.toString(arr));

        System.out.println("Max in array: "+ minArray(arr));
    }

    static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
