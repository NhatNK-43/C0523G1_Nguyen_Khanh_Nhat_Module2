package ss11_dsa_queue_stack.exercise.exe2;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int decimal = scanner.nextInt();

        Stack<Integer> binaryStack = new Stack<>();
        do {
            binaryStack.push(decimal % 2);
            decimal /= 2;
        } while (decimal != 0);

        String binary = "";
        while (binaryStack.size()>0){
            binary += binaryStack.pop();
        }

        System.out.println(binary);
    }
}
