package ss15_exception.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        boolean flag;

        do {
            try {
                System.out.print("Nhập chiều cạnh dài a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập chiều cạnh dài b: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập chiều cạnh dài c: ");
                c = Integer.parseInt(scanner.nextLine());
                flag = false;

                try {
                    Triangle triangle = new Triangle(a, b, c);
                    System.out.println(triangle);
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException e) {
                System.out.println("Chiều dài cạnh không phải là số.\n");
                flag = true;
            }
        } while (flag);
    }
}
