package case_study.controller.sub_controller;

import case_study.common.Validate;
import case_study.service.sub_service.ICustomerService;
import case_study.service.sub_service.impl.CustomerService;

public class CustomerManagementController {
    public static void customerManagement(){
        ICustomerService customerService = new CustomerService();
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
            selectCustomer = Validate.checkSelection(6);

            switch (selectCustomer){
                case 1:
                    customerService.findAll();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    customerService.search();
                    break;
                case 6:
                    break;
            }
        } while (selectCustomer!=6);
    }
}
