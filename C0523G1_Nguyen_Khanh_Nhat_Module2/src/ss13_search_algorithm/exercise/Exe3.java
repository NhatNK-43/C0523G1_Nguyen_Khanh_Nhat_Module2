package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Result: " + result(str));
    }

    private static String result(String str) {
        String[] arrChar = str.split("");
        String result = "";
        int indexContinue = 0;
        for (int i = 0; i < arrChar.length; i = indexContinue) {
            String stringMax = arrChar[indexContinue];
            String charMax = arrChar[indexContinue];

            for (int j = i + 1; j < arrChar.length; j++) {
                indexContinue = j;
                if (charMax.charAt(0) < arrChar[j].charAt(0)) {
                    charMax = arrChar[j];
                    stringMax += charMax;
                } else {
                    break;
                }
            }

            if (result.length() < stringMax.length()) {
                result = stringMax;
            }

            if (indexContinue == arrChar.length - 1) {
                break;
            }
        }
        return result;
    }
}
