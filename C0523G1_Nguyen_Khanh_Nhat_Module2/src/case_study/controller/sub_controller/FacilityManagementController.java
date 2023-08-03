package case_study.controller.sub_controller;

import case_study.common.InputAndCheckPerson;
import case_study.service.sub_service.IFacilityService;
import case_study.service.sub_service.impl.FacilityService;


public class FacilityManagementController {
    static final String REGEX_ID_VILLA = "^SVVL-\\d{4}$";
    static final String REGEX_ID_HOUSE = "^SVHO-\\d{4}$";
    static final String REGEX_ID_ROOM = "^SVRO-\\d{4}$";
    public static void facilityManagement() {
        IFacilityService facilityService = new FacilityService();
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
            selectFacility = InputAndCheckPerson.checkSelection(5);

            switch (selectFacility) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    System.out.println("\t-----Add Service-----");
                    System.out.println("\t1. Add new villa");
                    System.out.println("\t2. Add new house");
                    System.out.println("\t3. Add new room");
                    System.out.println("\t4. Back to menu");
                    int select = InputAndCheckPerson.checkSelection(4);

                    switch (select) {
                        case 1:
                            facilityService.add(REGEX_ID_VILLA);
                            break;
                        case 2:
                            facilityService.add(REGEX_ID_HOUSE);
                            break;
                        case 3:
                            facilityService.add(REGEX_ID_ROOM);
                            break;
                        case 4:
                            System.out.println("Successful add!");
                            break;
                    }
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    facilityService.delete();
                    break;
                case 5:
                    break;
            }
        } while (selectFacility != 5);
    }
}
