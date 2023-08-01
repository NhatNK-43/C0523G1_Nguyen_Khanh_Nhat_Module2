package case_study.controller.sub_controller;

import case_study.common.Validate;

public class PromotionManagementController {
    public static void promotionManagement(){
        int selectPromotion;
        do {
            System.out.println();
            System.out.println("---------Promotion Management---------");
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Enter your selection: ");
            selectPromotion = Validate.checkSelection(3);

            switch (selectPromotion){
                case 1:
                    break;
                case 3:
                    break;
            }
        } while (selectPromotion!=3);
        System.out.println();
    }
}
