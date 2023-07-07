package ss04_oop.exercise.quadraticequation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        QuadraticEquation quadraticEquation1 = new QuadraticEquation();
//        QuadraticEquation quadraticEquation2 = new QuadraticEquation(3,2,1);
//
//        quadraticEquation1.setA(5);
//        quadraticEquation1.setB(4);
//        quadraticEquation1.setC(-3);
//
//        quadraticEquation2.setC(-1);
//
//        quadraticEquation1.display();
//        quadraticEquation2.display();

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation3 = new QuadraticEquation(a,b,c);
        quadraticEquation3.display();
    }
}
