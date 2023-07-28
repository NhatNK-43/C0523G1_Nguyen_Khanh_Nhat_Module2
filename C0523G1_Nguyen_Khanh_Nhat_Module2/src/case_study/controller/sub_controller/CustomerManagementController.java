package case_study.controller.sub_controller;

import static case_study.controller.FuramaController.checkSelection;

public class CustomerManagementController {
    public static void customerManagement(){
        int selectCustomer;
        do {
            System.out.println();
            System.out.println("---------Customer Management---------");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
            System.out.println("6. Return main menu");
            System.out.print("Enter your selection: ");
            selectCustomer = checkSelection(6);

            switch (selectCustomer){
                case 1:
                    break;
                case 6:
                    break;
            }
        } while (selectCustomer!=6);
    }
}
