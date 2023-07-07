package ss04_oop.exercise.StopWatch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long[] arr = creatArray();
        System.out.println("Array arranged:");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(Arrays.toString(arrangeArray(arr)));
        stopWatch.stop();
        System.out.println("Array sort time is: "+ stopWatch.getElapsedTime());
    }
    
    public static long[] creatArray(){
        long [] arr =new long[100000];
        for (int i = 0;i<arr.length;i++){
            arr[i]=Math.round(Math.random()*100000);
        }
        return arr;
    }

    public static long[] arrangeArray(long[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    long temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
