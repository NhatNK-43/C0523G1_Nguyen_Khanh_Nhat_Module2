package ss03_array_method.exercise;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = {
                {4.2, 53.2, 1.2, 45.5},
                {52.3, 4.5, 82.3, 15},
                {5.2, 43.5, 8.4, 14.9},
        };

        System.out.println("Array created :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int col;
        do {
            System.out.printf("Enter column (0 <= column <= %d): ", (arr[0].length - 1));
            col = scanner.nextInt();
            if (col < 0 || col > arr[0].length - 1) {
                System.out.println("0 <= column <= " + (arr[0].length - 1));
            }
        } while (col < 0 || col > arr[0].length - 1);

        System.out.printf("Sum column %d: %.2f", col, sumColumn(arr, col));
    }

    static double sumColumn(double[][] arr, int col) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }
}
