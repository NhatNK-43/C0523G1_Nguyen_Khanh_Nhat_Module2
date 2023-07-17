package ss11_dsa_queue_stack.exercise.exe3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        String[] arrString = str.trim().toLowerCase().split("");

        Queue<String> stringQueue = new ArrayDeque<>();
        Stack<String> stringStack = new Stack<>();
        for (String w:arrString){
            stringQueue.offer(w);
            stringStack.push(w);
        }

        int count = 0;
        while (stringQueue.size()>0){
            if(!stringQueue.poll().equals(stringStack.pop())){
                count++;
                break;
            }
        }
        if (count>0){
            System.out.println("The string not is Palindrome ");
        } else {
            System.out.println("The string is Palindrome ");
        }
    }
}
