package ss03_array_method.exercise;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = {
                {4.2, 53.2, 1.2, 45.5},
                {52.3, 4.5, 82.3, 15},
                {5.2, 43.5, 8.4, 14.9},
                {5.9, 4.0, 18.4, 63.3},
        };

        System.out.println("Array created :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.printf("Sum diagonal: %.2f", sumDiagonal(arr));
    }

    static double sumDiagonal(double[][] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
