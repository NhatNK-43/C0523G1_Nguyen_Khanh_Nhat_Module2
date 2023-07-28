package case_study.controller.sub_controller;

import static case_study.controller.FuramaController.checkSelection;

public class FacilityManagementController {
    public static void facilityManagement(){
        int selectFacility;
        do {
            System.out.println();
            System.out.println("---------Facility Management---------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            System.out.print("Enter your selection: ");
            selectFacility = checkSelection(5);

            switch (selectFacility){
                case 1:
                    break;
                case 5:
                    break;
            }
        } while (selectFacility!=5);
    }
}
