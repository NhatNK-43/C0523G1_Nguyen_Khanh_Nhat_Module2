package ss01_introduction_java.practice;

import java.util.Scanner;

public class introduction_java_practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        do {
            System.out.print("Enter a year: ");
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("The year must be greater than 0");
            }
        } while (year < 0);

//        if (year % 400 == 0) {
//            System.out.println(year + " is a leap year");
//        } else {
//            if (year % 100 == 0) {
//                System.out.println(year + " is not a leap year");
//            } else {
//                if (year % 4 == 0) {
//                    System.out.println(year + " is a leap year");
//                } else {
//                    System.out.println(year + " is not a leap year");
//                }
//            }
//        }

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year");
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
