package case_study.controller;

import java.util.Scanner;

import static case_study.controller.sub_controller.BookingManagementController.bookingManagement;
import static case_study.controller.sub_controller.CustomerManagementController.customerManagement;
import static case_study.controller.sub_controller.EmployeeManagementController.employeeManagement;
import static case_study.controller.sub_controller.FacilityManagementController.facilityManagement;
import static case_study.controller.sub_controller.PromotionManagementController.promotionManagement;

public class FuramaController {
    public static void displayMainMenu() {
        int select;
        do {
            System.out.println("\n-------FURAMA MANAGEMENT-------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your selection: ");
            select = checkSelection(6);

            switch (select) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
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
            } else {
                break;
            }
        } while (true);
        return select;
    }
}
