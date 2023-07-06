package ss02_loop.exercise;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of primes to print: ");
        int numbers = scanner.nextInt();
        int count = 0;
        for (int i = 2; count < numbers; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
    }

    static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
