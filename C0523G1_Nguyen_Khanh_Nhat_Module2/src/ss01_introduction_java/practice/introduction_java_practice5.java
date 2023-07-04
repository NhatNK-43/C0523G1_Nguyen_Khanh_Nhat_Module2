package ss01_introduction_java.practice;

import java.util.Scanner;

public class introduction_java_practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte month;
        do {
            System.out.print("Enter a month: ");
            month  = scanner.nextByte();
            if (month<0 || month>12){
                System.out.println("The month must be from 1 to 12");
            }
        } while (month<0 || month>12);

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Month %d has 31 days",month);
                break;
            case 2:
                System.out.printf("Month %d has 28, 29 days",month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Month %d has 30 days",month);
                break;
        }
    }
}
