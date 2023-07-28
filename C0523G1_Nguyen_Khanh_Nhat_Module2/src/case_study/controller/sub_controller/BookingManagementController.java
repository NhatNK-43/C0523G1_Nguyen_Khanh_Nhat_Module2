package case_study.controller.sub_controller;

import static case_study.controller.FuramaController.checkSelection;

public class BookingManagementController {
    public static void bookingManagement(){
        int selectBooking;
        do {
            System.out.println();
            System.out.println("---------Booking Management---------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Enter your selection: ");
            selectBooking = checkSelection(6);

            switch (selectBooking){
                case 1:
                    break;
                case 6:
                    break;
            }
        } while (selectBooking!=6);
    }
}
