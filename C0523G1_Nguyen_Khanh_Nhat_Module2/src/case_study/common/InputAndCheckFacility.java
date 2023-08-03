package case_study.common;

import case_study.model.facility.Facility;

import java.util.Map;
import java.util.Scanner;

public class InputAndCheckFacility {
    static final String REGEX_NAME = "^[A-Z][a-z0-9\\s]*$";
    static final String REGEX_ID = "^SV(VL|HO|RO)-\\d{4}$";

    public static String checkServiceIdToAdd(String regexId, Map<Facility, Integer> facilityMap){
        Scanner scanner = new Scanner(System.in);
        String serviceId;
        do {
            serviceId = scanner.nextLine();
            if (serviceId.matches(regexId)){
                if (facilityMap.containsKey(new Facility(serviceId))){
                    System.out.print("The service ID: "+serviceId+" already exist! Please re-enter: ");
                } else {
                    return serviceId;
                }
            } else {
                System.out.print("The service ID is invalid! Please re-enter: ");
            }
        } while (true);
    }

    public static String checkServiceIdToRemove(Map<Facility, Integer> facilityMap){
        Scanner scanner = new Scanner(System.in);
        String serviceId;
        do {
            serviceId = scanner.nextLine();
            if (serviceId.matches(REGEX_ID)){
                if (facilityMap.containsKey(new Facility(serviceId))){
                    return serviceId;
                } else {
                    System.out.print("Not found the service ID: "+serviceId+"! Please re-enter: ");
                }
            } else {
                System.out.print("The service ID is invalid! Please re-enter: ");
            }
        } while (true);
    }
    public static String checkName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            name = scanner.nextLine();
            if (name.matches(REGEX_NAME)) {
                return name;
            } else {
                System.out.print("The name is invalid! Please re-enter: ");
            }
        } while (true);
    }

    public static double checkArea() {
        Scanner scanner = new Scanner(System.in);
        double area;
        do {
            try {
                area = Double.parseDouble(scanner.nextLine());
                if (area < 30) {
                    System.out.print("The area must be more than 30m2! Please re-enter: ");
                } else {
                    return area;
                }
            } catch (NumberFormatException e) {
                System.out.print("The character you entered is not a number! Please re-enter: ");
            }
        } while (true);
    }

    public static double checkRentalCosts() {
        Scanner scanner = new Scanner(System.in);
        double rentalCosts;
        do {
            try {
                rentalCosts = Double.parseDouble(scanner.nextLine());
                if (rentalCosts <= 0) {
                    System.out.print("The rental costs must be more than 0! Please re-enter: ");
                } else {
                    return rentalCosts;
                }
            } catch (NumberFormatException e) {
                System.out.print("The character you entered is not a number! Please re-enter: ");
            }
        } while (true);
    }

    public static int checkNumberOfPeople() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople;
        do {
            try {
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                if (numberOfPeople <= 0 || numberOfPeople >= 20) {
                    System.out.print("Number of people must be more than 0 and less than 20! Please re-enter: ");
                } else {
                    return numberOfPeople;
                }
            } catch (NumberFormatException e) {
                System.out.print("The character you entered is not a number! Please re-enter: ");
            }
        } while (true);
    }

    public static int checkNumberOfFloor() {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloor;
        do {
            try {
                numberOfFloor = Integer.parseInt(scanner.nextLine());
                if (numberOfFloor <= 0) {
                    System.out.print("Number of floor must be more than 0! Please re-enter: ");
                } else {
                    return numberOfFloor;
                }
            } catch (NumberFormatException e) {
                System.out.print("The character you entered is not a number! Please re-enter: ");
            }
        } while (true);
    }
}
