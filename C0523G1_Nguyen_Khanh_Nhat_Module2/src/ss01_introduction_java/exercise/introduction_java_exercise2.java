package ss01_introduction_java.exercise;

import java.util.Scanner;

public class introduction_java_exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dollars to convert: ");
        float dollar = scanner.nextFloat();
        System.out.println("VND: "+(dollar*23000));
    }
}
