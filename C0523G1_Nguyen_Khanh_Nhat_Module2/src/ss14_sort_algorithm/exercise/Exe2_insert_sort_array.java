package ss14_sort_algorithm.exercise;

import java.util.Arrays;

public class Exe2_insert_sort_array {
    public static void main(String[] args) {
        int[] list = {32, 51, 43, 2, 68, 12, 58, 79, 65, 35, 4, 81, 32};
        System.out.println("Array created: " + Arrays.toString(list));
        System.out.println("Length: " + list.length);
        System.out.println("Array arranged: " + Arrays.toString(insertSort(list)));
    }

    private static int[] insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j;
            int temp = list[i];
            for (j = i - 1; j >= 0; j--) {
                if (list[j] < temp) {
                    break;
                }
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;
        }
        return list;
    }
}
