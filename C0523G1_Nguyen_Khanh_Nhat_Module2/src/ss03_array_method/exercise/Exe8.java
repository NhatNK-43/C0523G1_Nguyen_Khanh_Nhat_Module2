package ss03_array_method.exercise;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "asddasasdvaanfqfnq   / //aa 665fqf";
        System.out.println("The string entered: " + str);

        System.out.print("Enter a character: ");
        char c = scanner.nextLine().charAt(0);

        if(countCharacter(str,c)==0){
            System.out.printf("There are no character '%c' in the string",c);
        } else {
            System.out.printf("There are %d character '%c' in the string", countCharacter(str, c), c);
        }
    }

    static int countCharacter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
