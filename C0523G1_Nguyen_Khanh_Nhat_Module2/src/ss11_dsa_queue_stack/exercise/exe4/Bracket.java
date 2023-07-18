package ss11_dsa_queue_stack.exercise.exe4;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.Objects;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        if (checkBracket(str)) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }

    public static boolean checkBracket(String str) {
        Stack<String> bStack = new Stack<>();
        String[] arrayString = str.trim().split("");
        for (int i = 0; i < arrayString.length; i++) {
            if (Objects.equals(arrayString[i], "(")) {
                bStack.push(arrayString[i]);
            }
            if (Objects.equals(arrayString[i], ")")) {
                if (bStack.empty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        return bStack.empty();
    }
}
