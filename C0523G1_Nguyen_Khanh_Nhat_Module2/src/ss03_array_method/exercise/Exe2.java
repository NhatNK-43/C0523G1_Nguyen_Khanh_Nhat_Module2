package ss03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {15,6,3,8,5,7,2,1,35,6};
        System.out.println("Array created: "+Arrays.toString(arr));
        System.out.print("Enter the value of the element to be deleted: ");
        int n = scanner.nextInt();
        if (checkElementInArray(n,arr)==-1){
            System.out.printf("There is no element %d in the array",n);
        } else {
            System.out.println("Element to be deleted at position: "+checkElementInArray(n,arr));
            System.out.printf("The array after removing element "+n+": "+ Arrays.toString(removeElementInArray(n, arr)));
        }
    }
    static int checkElementInArray(int number,int[] arr){
        for (int i=0;i<arr.length;i++){
            if (number==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int[] removeElementInArray(int number, int[] arr){
        if (checkElementInArray(number,arr)!=-1){
            for (int i=checkElementInArray(number,arr);i<arr.length-1;i++){
                arr[i]=arr[i+1];

            }
            arr[arr.length-1]=0;
            removeElementInArray(number,arr);
        }
        return arr;
    }
}
