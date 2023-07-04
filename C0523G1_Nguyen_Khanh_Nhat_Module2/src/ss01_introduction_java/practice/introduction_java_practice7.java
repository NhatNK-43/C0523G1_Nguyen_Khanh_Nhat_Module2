package ss01_introduction_java.practice;

import java.util.Scanner;

public class introduction_java_practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Enter height (m): ");
        float height = scanner.nextFloat();

        float BMI = (float) (weight / Math.pow(height, 2));

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}