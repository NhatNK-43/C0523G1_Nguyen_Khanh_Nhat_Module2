package ss12_java_collection_framework.exe2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        String str = "Depending on the situation, we use the appropriate methods, " +
//                "but usually we use the second structure public String[]" +
//                " split(String regex), with regex as the sign that we need to split. " +
//                "For better understanding, please read the following example of " +
//                "splitting a string into an array:";

        System.out.println(Arrays.toString(stringToArray(str)));

        Map<String, Integer> myTreeMap = new TreeMap<>();
        int value = 1;
        for (String word : stringToArray(str)) {
            if (myTreeMap.containsKey(word)) {
                value = myTreeMap.get(word) + 1;
            }
            myTreeMap.put(word, value);
        }

        for (String key : myTreeMap.keySet()) {
            System.out.println(key + " - " + myTreeMap.get(key));
        }
    }

    public static String arrayToStingSpace(String[] arr) {
        String result = "";
        for (String ch : arr) {
            result += ch + " ";
        }
        return result;
    }

    public static String[] stringToArray(String str) {
        String[] arrString = str.trim().toLowerCase().split("\\W");
        return arrayToStingSpace(arrString).split("\\s+");
    }
}
