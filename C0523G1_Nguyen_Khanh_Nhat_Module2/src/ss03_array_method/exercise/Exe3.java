package ss03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[5];
        enterArray(arr1);
        enterArray(arr2);
        System.out.println("Array 1 created: " + Arrays.toString(arr1));
        System.out.println("Array 2 created: " + Arrays.toString(arr2));
        System.out.println("Array after insert: " + Arrays.toString(mergeArray(arr1,arr2)));
    }

    static void enterArray(int [] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++){
            System.out.printf("Enter element %d: ",i+1);
            arr[i]= sc.nextInt();
        }
    }

    static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] arrResult = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, arrResult, 0, arr1.length);
        System.arraycopy(arr2,0,arrResult,arr1.length,arr2.length);
        return arrResult;
    }
}
