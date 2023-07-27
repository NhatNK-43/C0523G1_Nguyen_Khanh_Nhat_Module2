package ss19_string_regex.exercise;

import java.util.Scanner;

public class ValidateClassName {
    private static final String REGEX_CLASS = "^[CAP][0-9]{4}[GHIK]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        System.out.println("Class name: " + className);

        if (className.matches(REGEX_CLASS)) {
            System.out.println("Valid class name!");
        } else {
            System.out.println("Invalid class name!");
        }
    }
}
