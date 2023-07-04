package ss01_introduction_java.exercise;

import java.util.Scanner;

public class introduction_java_exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
