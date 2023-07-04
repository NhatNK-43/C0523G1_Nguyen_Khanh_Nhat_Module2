package ss01_introduction_java.practice;

import java.util.Scanner;

public class introduction_java_practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a  = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a==0){
            if (b==0){
                System.out.println("The equation has infinitely many solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            System.out.println("Equation with solution x = "+(-b/a));
        }
    }
}
