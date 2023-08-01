package case_study.common;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;


public class Validate {
    static final String REGEX_DATE = "^\\d{2}/\\d{2}/\\d{4}$";
    static final String REGEX_NAME = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$";
    static final String REGEX_ID_CARD = "^\\d{9}$|^\\d{12}$";
    static final String REGEX_PHONE_NUMBER = "0\\d{9}";
    static final String REGEX_EMAIL = "^[a-zA-Z0-9.]{6,30}+@[a-zA-Z]+\\.[a-zA-Z]+$";
    static final String REGEX_ADDRESS = "^[a-zA-Z0-9-,.\\s]+$";

    public static boolean checkId(String id, String regexId) {
        return id.matches(regexId);
    }

    public static int checkSelection(int maxSelect) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        boolean checkSelection;
        do {
            checkSelection = false;
            try {
                select = Integer.parseInt(scanner.nextLine());
                if (select < 1 || select > maxSelect) {
                    checkSelection = true;
                }
            } catch (NumberFormatException e) {
                checkSelection = true;
            }
            if (checkSelection) {
                System.out.print("Invalid selection. Please re-enter: ");
            }
        } while (checkSelection);
        return select;
    }
    public static String checkName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name;
        String[] stringName;
        do {
            name = scanner.nextLine();
            if (!name.matches(REGEX_NAME)) {
                System.out.print("The name is not syntactically correct! Please re-enter: ");
            } else {
                //stringName= name.trim().toLowerCase().split(" ");
                return name;
            }
        } while (true);
    }

    public static LocalDate checkDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Date of birth (dd/mm/yyyy): ");
        String date;
        LocalDate localDate;
        LocalDate localDate18 = LocalDate.now().minusYears(18);
        do {
            date = scanner.nextLine();
            if (!date.matches(REGEX_DATE)) {
                System.out.print("The date of birth is not syntactically correct! Please re-enter: ");
            } else {
                try {
                    String[] strings = date.split("/");
                    localDate = LocalDate.of(Integer.parseInt(strings[2]),Integer.parseInt(strings[1]),Integer.parseInt(strings[0]));
                    if (localDate.isBefore(localDate18)){
                        return localDate;
                    } else {
                        System.out.print("Under 18! Please re-enter: ");
                    }
                } catch (DateTimeException e) {
                    System.out.print("Invalid date! Please re-enter: ");
                }
            }
        } while (true);
    }

    public static String checkGender() {
        String gender = "";
        int select;

        System.out.println("Gender: \n\t1. Male\n\t2. Female\n\t3. Other");
        System.out.print("\tEnter your selection: ");
        select = checkSelection(3);
        switch (select) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
        }
        return gender;
    }

    public static String checkIdCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID Card: ");
        String idCard;

        do {
            idCard = scanner.nextLine();
            if (!idCard.matches(REGEX_ID_CARD)) {
                System.out.print("ID Card is incorrect! Please re-enter: ");
            } else {
                return idCard;
            }
        } while (true);
    }

    public static String checkPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Phone number (0XXXXXXXXXX): ");
        String phoneNumber;

        do {
            phoneNumber = scanner.nextLine();
            if (!phoneNumber.matches(REGEX_PHONE_NUMBER)) {
                System.out.print("Phone number is incorrect! Please re-enter: ");
            } else {
                return phoneNumber;
            }
        } while (true);
    }

    public static String checkEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String phoneNumber;

        do {
            phoneNumber = scanner.nextLine();
            if (!phoneNumber.matches(REGEX_EMAIL)) {
                System.out.print("Email is incorrect! Please re-enter: ");
            } else {
                return phoneNumber;
            }
        } while (true);
    }

    public static String checkLiteracy() {
        System.out.println("Literacy: ");
        System.out.println("\t1. Intermediate");
        System.out.println("\t2. College");
        System.out.println("\t3. University");
        System.out.println("\t4. After university");
        System.out.print("\tEnter your selection: ");
        int select = checkSelection(4);
        String literacy = "";
        switch (select) {
            case 1:
                literacy = "Intermediate";
                break;
            case 2:
                literacy = "College";
                break;
            case 3:
                literacy = "University";
                break;
            case 4:
                literacy = "After university";
                break;
        }
        return literacy;
    }

    public static String checkPosition() {
        System.out.println("Position: ");
        System.out.println("\t1. Receptionist");
        System.out.println("\t2. Staff");
        System.out.println("\t3. Expert");
        System.out.println("\t4. Supervisor");
        System.out.println("\t5. Manager");
        System.out.println("\t6. Director");
        System.out.print("\tEnter your selection: ");
        int select = checkSelection(6);
        String position = "";
        switch (select) {
            case 1:
                position = "Receptionist";
                break;
            case 2:
                position = "Staff";
                break;
            case 3:
                position = "Expert";
                break;
            case 4:
                position = "Supervisor";
                break;
            case 5:
                position = "Manager";
                break;
            case 6:
                position = "Director";
                break;
        }
        return position;
    }

    public static double checkSalary() {
        Scanner scanner = new Scanner(System.in);
        double salary = 0.0;
        boolean flag;
        System.out.print("Salary: ");
        do {
            flag = false;
            try {
                salary = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("The character you entered is not a number! Please re-enter: ");
                flag = true;
            }
        } while (flag);
        return salary;
    }

    public static String checkCustomerType() {
        System.out.println("Customer type: ");
        System.out.println("\t1. Diamond");
        System.out.println("\t2. Platinum");
        System.out.println("\t3. Gold");
        System.out.println("\t4. Sliver");
        System.out.println("\t5. Member");
        System.out.print("\tEnter your selection: ");
        int select = checkSelection(5);
        String customerType = "";
        switch (select) {
            case 1:
                customerType = "Receptionist";
                break;
            case 2:
                customerType = "Staff";
                break;
            case 3:
                customerType = "Expert";
                break;
            case 4:
                customerType = "Supervisor";
                break;
            case 5:
                customerType = "Manager";
                break;
            case 6:
                customerType = "Director";
                break;
        }
        return customerType;
    }

    public static String checkAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Address: ");
        String address;
        do {
            address = scanner.nextLine();
            if(!address.matches(REGEX_ADDRESS)){
                System.out.print("The address is invalid! Please re-enter: ");
            } else {
                return address;
            }
        } while (true);
    }
}
