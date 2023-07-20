package ss13_search_algorithm.exercise;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[] arrChar = str.split("");
        String result = arrChar[0];
        String charMax = arrChar[0];
        for (int i = 1; i < arrChar.length; i++) {
            if (charMax.charAt(0) < arrChar[i].charAt(0)) {
                charMax = arrChar[i];
                result += charMax;
            }
        }
        System.out.println(result);
    }
}
