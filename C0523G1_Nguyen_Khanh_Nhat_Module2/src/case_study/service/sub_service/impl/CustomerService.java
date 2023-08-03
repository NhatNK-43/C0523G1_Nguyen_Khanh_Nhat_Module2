package case_study.service.sub_service.impl;

import case_study.common.InputAndCheckPerson;
import case_study.model.person.Customer;
import case_study.repository.sub_repository.ICustomerRepository;
import case_study.repository.sub_repository.repository_impl.CustomerRepository;
import case_study.service.sub_service.ICustomerService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepository();
    List<Customer> customerList = customerRepository.findAll();
    String REGEX_ID = "KH-\\d{4}";

    @Override
    public void findAll() {
        if (customerList.size() == 0) {
            System.out.println("Empty list!");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }

    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id;
        do {
            id = scanner.nextLine();
            if (!InputAndCheckPerson.inputAndCheckId(id, REGEX_ID)) {
                System.out.print("The ID is invalid! Please re-enter (NV-XXXX): ");
            } else {
                if (customerList.contains(new Customer(id))) {
                    System.out.println("The ID: " + id + " already exist");
                } else {
                    break;
                }
            }
        } while (true);

        String name = InputAndCheckPerson.inputAndCheckName();
        LocalDate date = InputAndCheckPerson.inputAndCheckDate();
        String gender = InputAndCheckPerson.inputAndCheckGender();
        String idCard = InputAndCheckPerson.inputAndCheckIdCard();
        String phoneNumber = InputAndCheckPerson.inputAndCheckPhoneNumber();
        String email = InputAndCheckPerson.inputAndCheckEmail();
        String customerType = InputAndCheckPerson.inputAndCheckCustomerType();
        String address = InputAndCheckPerson.inputAndCheckAddress();

        Customer customer = new Customer(id, name, date, gender, idCard,
                phoneNumber, email, customerType, address);

        customerList.add(customer);
        customerRepository.add(customer);
        System.out.println("Successful add!");
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID you want to edit: ");
        String id;
        do {
            id = scanner.nextLine();
            if (!InputAndCheckPerson.inputAndCheckId(id, REGEX_ID)) {
                System.out.print("The ID is invalid! Please re-enter (NV-XXXX): ");
            } else {
                if (customerList.contains(new Customer(id))) {
                    break;
                } else {
                    System.out.println("Not found ID: " + id);
                }
            }
        } while (true);

        int select;
        do {
            System.out.println("------Edit Customer-----");
            System.out.println("1. Edit name");
            System.out.println("2. Edit date of birth");
            System.out.println("3. Edit gender");
            System.out.println("4. Edit ID card");
            System.out.println("5. Edit phone number");
            System.out.println("6. Edit email");
            System.out.println("7. Edit customer type");
            System.out.println("8. Edit address");
            System.out.println("9. Exit");
            System.out.print("Enter your selection: ");
            select = InputAndCheckPerson.checkSelection(9);

            int index = customerList.indexOf(new Customer(id));
            Customer customer = customerList.get(index);
            switch (select) {
                case 1:
                    customer.setName(InputAndCheckPerson.inputAndCheckName());
                    break;
                case 2:
                    customer.setDate(InputAndCheckPerson.inputAndCheckDate());
                    break;
                case 3:
                    customer.setGender(InputAndCheckPerson.inputAndCheckGender());
                    break;
                case 4:
                    customer.setIdCard(InputAndCheckPerson.inputAndCheckIdCard());
                    break;
                case 5:
                    customer.setPhoneNumber(InputAndCheckPerson.inputAndCheckPhoneNumber());
                    break;
                case 6:
                    customer.setEmail(InputAndCheckPerson.inputAndCheckEmail());
                    break;
                case 7:
                    customer.setCustomerType(InputAndCheckPerson.inputAndCheckCustomerType());
                    break;
                case 8:
                    customer.setAddress(InputAndCheckPerson.inputAndCheckAddress());
                    break;
                case 9:
                    System.out.println("Do you want to save the changes?\n\t1. Yes\t 2. No");
                    System.out.print("Enter your selection: ");
                    int selectYN = InputAndCheckPerson.checkSelection(2);
                    switch (selectYN) {
                        case 1:
                            customerRepository.edit(id, customerList, customer);
                            System.out.println("Successful edit!");
                            break;
                        case 2:
                            break;
                    }
            }
        } while (select != 9);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID you want to remove: ");
        String id;
        do {
            id = scanner.nextLine();
            if (!InputAndCheckPerson.inputAndCheckId(id, REGEX_ID)) {
                System.out.print("The ID is invalid! Please re-enter (NV-XXXX): ");
            } else {
                if (customerList.contains(new Customer(id))) {
                    break;
                } else {
                    System.out.println("Not found ID: " + id);
                }
            }
        } while (true);
        customerRepository.delete(id, customerList);
        System.out.println("Successful remove!");
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name you want to search: ");
        String name = scanner.nextLine();
        List<Customer> customers = customerRepository.search(name, customerList);
        System.out.println("Search list with the name: " + name);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
