package case_study.controller.sub_controller;

import case_study.service.sub_service.IEmployeeService;
import case_study.service.sub_service.impl.EmployeeService;

import static case_study.controller.FuramaController.checkSelection;

public class EmployeeManagementController {
    public static void employeeManagement(){
        IEmployeeService employeeService = new EmployeeService();
        int selectEmployee;
        do {
            System.out.println();
            System.out.println("---------Employee Management---------");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.print("Enter your selection: ");
            selectEmployee = checkSelection(6);

            switch (selectEmployee){
                case 1:
                    employeeService.displayEmp();
                    break;
                case 6:
                    break;
            }
        } while (selectEmployee!=6);
    }
}
