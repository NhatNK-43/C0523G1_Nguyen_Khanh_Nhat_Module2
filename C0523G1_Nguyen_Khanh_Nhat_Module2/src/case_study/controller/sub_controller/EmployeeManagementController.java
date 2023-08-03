package case_study.controller.sub_controller;

import case_study.common.InputAndCheckPerson;
import case_study.service.sub_service.impl.EmployeeService;


public class EmployeeManagementController {
    public static void employeeManagement(){
        EmployeeService employeeService = new EmployeeService();
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
            selectEmployee = InputAndCheckPerson.checkSelection(6);

            switch (selectEmployee){
                case 1:
                    employeeService.findAll();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    employeeService.search();
                    break;
                case 6:
                    break;
            }
        } while (selectEmployee!=6);
    }
}
