package ss19_string_regex.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidateNumberPhone {
    private static final String REGEX_PHONE_NUMBER = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public static void main(String[] args) {
        List<String> phoneNumberList = new ArrayList<>();
        String phoneNumber1 = "(84)-(0222222222)";
        String phoneNumber2 = "(a8)-(2222222222)";
        String phoneNumber3 = "(84)-(22b2222222)";
        String phoneNumber4 = "(84)-(0978489648)";

        phoneNumberList.add(phoneNumber1);
        phoneNumberList.add(phoneNumber2);
        phoneNumberList.add(phoneNumber3);
        phoneNumberList.add(phoneNumber4);

        for (String phoneNumber:phoneNumberList){
            if (phoneNumber.matches(REGEX_PHONE_NUMBER)){
                System.out.println(phoneNumber+": Phone number valid.");
            } else {
                System.out.println(phoneNumber+": Phone number invalid.");
            }
        }
    }
}
