package case_study.controller;

import case_study.common.Validate;


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
            select = Validate.checkSelection(6);

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
}
