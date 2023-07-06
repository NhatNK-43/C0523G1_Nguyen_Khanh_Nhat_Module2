package algorithm;

import java.util.Scanner;

public class Draw_a_rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n * 2 - 1; row++) {
            for (int col = 1; col <= n * 2; col++) {
                if (col == n - row + 1 || col == n + row || col == row - n + 1 || col == 3 * n - row) {
                    System.out.print(row <= n ? row : 2 * n - row);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
