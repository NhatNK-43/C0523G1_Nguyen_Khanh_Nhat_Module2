package ss01_introduction_java.exercise;

import java.util.Scanner;

public class introduction_java_exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String readNumber;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("The number must be great than 0 and less than 1000");
            }
        } while (number < 0 || number > 999);

        if (number > 0 && number < 20) {
            readNumber = readNum1_20(number );
        } else if (number < 100) {
            if (number % 10 == 0) {
                readNumber = readNum20_90(number);
            } else {
                readNumber = readNum20_90(number) + " " + readNum1_20(number % 10);
            }

        } else {
            if (number % 100 == 0) {
                readNumber = readNum1_20(number / 100) + " hundred ";
            } else if (number % 100 < 20) {
                readNumber = readNum1_20(number / 100) + " hundred " + readNum1_20(number%100) ;
            }  else if (number % 10 == 0){
                readNumber = readNum1_20(number / 100) + " hundred " + readNum20_90(number % 100);
            }else {
                readNumber = readNum1_20(number / 100) + " hundred " + readNum20_90(number % 100) +" "+ readNum1_20((number%100)%10);
            }
        }

        System.out.println(number+" : "+readNumber);
    }

    public static String readNum1_20(int number) {
        String readNumber = "";
        switch (number) {
            case 0:
                readNumber = "zero";
                break;
            case 1:
                readNumber = "one";
                break;
            case 2:
                readNumber = "two";
                break;
            case 3:
                readNumber = "three";
                break;
            case 4:
                readNumber = "four";
                break;
            case 5:
                readNumber = "five";
                break;
            case 6:
                readNumber = "six";
                break;
            case 7:
                readNumber = "seven";
                break;
            case 8:
                readNumber = "eight";
                break;
            case 9:
                readNumber = "nine";
                break;
            case 10:
                readNumber = "ten";
                break;
            case 11:
                readNumber = "eleven";
                break;
            case 12:
                readNumber = "twelve";
                break;
            case 13:
                readNumber = "thirteen";
                break;
            case 14:
                readNumber = "fourteen";
                break;
            case 15:
                readNumber = "fifteen";
                break;
            case 16:
                readNumber = "sixteen";
                break;
            case 17:
                readNumber = "seventeen";
                break;
            case 18:
                readNumber = "eighteen";
                break;
            case 19:
                readNumber = "nineteen";
                break;
        }
        return readNumber;
    }

    public static String readNum20_90(int number) {
        int number20_90 = number / 10;
        String readNumber20_90 = "";
        switch (number20_90) {
            case 2:
                readNumber20_90 = "twenty";
                break;
            case 3:
                readNumber20_90 = "thirty";
                break;
            case 4:
                readNumber20_90 = "forty";
                break;
            case 5:
                readNumber20_90 = "fifty";
                break;
            case 6:
                readNumber20_90 = "sixty";
                break;
            case 7:
                readNumber20_90 = "seventy";
                break;
            case 8:
                readNumber20_90 = "eighty";
                break;
            case 9:
                readNumber20_90 = "ninety";
                break;
        }
        return readNumber20_90;
    }
}
