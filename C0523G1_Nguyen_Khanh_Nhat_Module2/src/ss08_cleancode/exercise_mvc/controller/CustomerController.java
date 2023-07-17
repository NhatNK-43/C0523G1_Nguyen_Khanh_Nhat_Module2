package ss08_cleancode.exercise_mvc.controller;

import ss08_cleancode.exercise_mvc.model.Customer;
import ss08_cleancode.exercise_mvc.service.CustomerServiceImpl;
import ss08_cleancode.exercise_mvc.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void main(String[] args) {
        ICustomerService service = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("\n------Customer Manager------");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Remove");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    service.displayCustomer();
                    break;
                case 2:
                    System.out.print("Input ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("\nInput name: ");
                    String name = scanner.nextLine();
                    System.out.print("\nInput age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("\nInput type - customer: ");
                    String typeCustomer = scanner.nextLine();
                    Customer customer = new Customer(id,name,age,typeCustomer);
                    service.addCustomer(customer);
                    break;
                case 3:
                    System.out.print("Input ID: ");
                    int removeID = Integer.parseInt(scanner.nextLine());
                    service.removeCustomer(removeID);
                    break;
                case 4:
                    System.out.print("Input name: ");
                    String searchName = scanner.nextLine();
                    if (service.searchCustomer(searchName).size()==0){
                        System.out.println("Not found name: "+searchName);
                    } else {
                        System.out.println(service.searchCustomer(searchName));
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
