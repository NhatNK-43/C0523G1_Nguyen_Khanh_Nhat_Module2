package ss11_dsa_queue_stack.exercise.exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(7);
        integerList.add(6);
        integerList.add(4);
        System.out.println(integerList);

        for (Integer number : integerList) {
            stack.push(number);
        }

        for (int i = 0; stack.size() > 0; i++) {
            integerList.set(i, stack.pop());
        }

        System.out.println(integerList);


        Stack<String> wStack = new Stack<>();
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println(str);

        String[] arrayString = str.split(" ");
        for (String w : arrayString) {
            wStack.push(w);
        }

        String result = "";
        while (wStack.size() > 0) {
            result += wStack.pop()+" ";
        }

        System.out.println(result);
    }
}
