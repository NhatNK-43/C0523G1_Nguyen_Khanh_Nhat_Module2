package ss03_array_method.exercise;

public class Exe4 {
    public static void main(String[] args) {
        double[][] arr = {
                {4.2, 53.2, 1.2, 45.1},
                {52.3, 4.5, 82.3, 15},
                {5.2, 43.5, 8.4, 14.9},
        };

        System.out.println("Array created:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.printf("Max in array: %.2f\nPosition: [%d][%d]", maxArray(arr)[0], (int) maxArray(arr)[1], (int) maxArray(arr)[2]);
    }

    static double[] maxArray(double[][] arr) {
        double[] arrResult = new double[3];
        arrResult[0] = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arrResult[0] < arr[i][j]) {
                    arrResult[0] = arr[i][j];
                    arrResult[1] = i;
                    arrResult[2] = j;
                }
            }
        }
        return arrResult;
    }
}
