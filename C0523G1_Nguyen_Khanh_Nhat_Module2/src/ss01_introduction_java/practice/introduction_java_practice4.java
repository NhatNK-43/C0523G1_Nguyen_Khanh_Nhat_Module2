package ss01_introduction_java.practice;

import java.util.Scanner;

public class introduction_java_practice3 {
    public static void main(String[] args) {
        double width,length;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        double area = length*width;
        System.out.println("Area: "+area);
    }
}
