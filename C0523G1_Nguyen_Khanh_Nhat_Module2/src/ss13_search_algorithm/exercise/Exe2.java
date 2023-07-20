package ss13_search_algorithm.exercise;

import java.util.*;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nArray arranged: ");
        System.out.println(Arrays.toString(arrangeArray(arr)));

        System.out.print("\nEnter the value to find: ");
        int searchValue = scanner.nextInt();

        if (binarySearch(arr, searchValue, 0, arr.length - 1) != -1) {
            System.out.println("The value to find at position: " +
                    binarySearch(arr, searchValue, 0, arr.length - 1));
        } else {
            System.out.println("Not found!");
        }
    }

    private static int[] arrangeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int binarySearch(int[] arr, int value, int left, int right) {
        int middle = (left + right) / 2;
        if (arr[middle] == value) {
            return middle;
        } else if (arr[middle] < value) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        if (left <= right) {
            return binarySearch(arr, value, left, right);
        }
        return -1;
    }
}
