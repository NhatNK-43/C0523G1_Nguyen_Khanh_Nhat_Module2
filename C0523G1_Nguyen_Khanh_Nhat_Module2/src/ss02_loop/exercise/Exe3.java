package ss02_loop.exercise;


public class Exe3 {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 100: ");
        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
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
