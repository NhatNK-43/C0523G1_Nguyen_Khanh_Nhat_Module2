package ss13_search_algorithm.exercise;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[] arrChar = str.split("");
        String result = arrChar[0];
        for (int i = 0; i < arrChar.length; i++) {
            String charMax = arrChar[i];
            String stringMax = arrChar[i];
            for (int j=i+1;j<arrChar.length;j++){
                if (charMax.charAt(0) < arrChar[j].charAt(0)) {
                    charMax = arrChar[j];
                    stringMax += charMax;
                }
            }

            if(result.length()<stringMax.length()){
                result = stringMax;
            }
        }
        System.out.println(result);
    }
}
