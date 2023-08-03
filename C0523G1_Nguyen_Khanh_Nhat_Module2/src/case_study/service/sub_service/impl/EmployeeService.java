package case_study.service.sub_service.impl;

import case_study.common.InputAndCheckPerson;
import case_study.model.person.Employee;
import case_study.repository.sub_repository.IEmployeeRepository;
import case_study.repository.sub_repository.repository_impl.EmployeeRepository;
import case_study.service.sub_service.IEmployeeService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    List<Employee> employeeList = employeeRepository.findAll();
    String REGEX_ID = "NV-\\d{4}";

    @Override
    public void findAll() {
        if (employeeList.size() == 0) {
            System.out.println("Empty list!");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
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
                if (employeeList.contains(new Employee(id))) {
                    System.out.print("The ID: " + id + " already exist. Please re-enter: ");
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
        String literacy = InputAndCheckPerson.inputAndCheckLiteracy();
        String position = InputAndCheckPerson.inputAndCheckPosition();
        Double salary = InputAndCheckPerson.inputAndCheckSalary();

        Employee employee = new Employee(id, name, date, gender, idCard,
                phoneNumber, email, literacy, position, salary);

        employeeList.add(employee);
        employeeRepository.add(employee);
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
                if (employeeList.contains(new Employee(id))) {
                    break;
                } else {
                    System.out.println("Not found ID: " + id);
                }
            }
        } while (true);

        int select;
        do {
            System.out.println("------Edit Employee-----");
            System.out.println("1. Edit name");
            System.out.println("2. Edit date of birth");
            System.out.println("3. Edit gender");
            System.out.println("4. Edit ID card");
            System.out.println("5. Edit phone number");
            System.out.println("6. Edit email");
            System.out.println("7. Edit literacy");
            System.out.println("8. Edit position");
            System.out.println("9. Edit salary");
            System.out.println("10. Exit");
            System.out.print("Enter your selection: ");
            select = InputAndCheckPerson.checkSelection(10);

            int index = employeeList.indexOf(new Employee(id));
            Employee employee = employeeList.get(index);
            switch (select) {
                case 1:
                    employee.setName(InputAndCheckPerson.inputAndCheckName());
                    break;
                case 2:
                    employee.setDate(InputAndCheckPerson.inputAndCheckDate());
                    break;
                case 3:
                    employee.setGender(InputAndCheckPerson.inputAndCheckGender());
                    break;
                case 4:
                    employee.setIdCard(InputAndCheckPerson.inputAndCheckIdCard());
                    break;
                case 5:
                    employee.setPhoneNumber(InputAndCheckPerson.inputAndCheckPhoneNumber());
                    break;
                case 6:
                    employee.setEmail(InputAndCheckPerson.inputAndCheckEmail());
                    break;
                case 7:
                    employee.setLiteracy(InputAndCheckPerson.inputAndCheckLiteracy());
                    break;
                case 8:
                    employee.setPosition(InputAndCheckPerson.inputAndCheckPosition());
                    break;
                case 9:
                    employee.setSalary(InputAndCheckPerson.inputAndCheckSalary());
                    break;
                case 10:
                    System.out.println("Do you want to save the changes?\n\t1. Yes\t 2. No");
                    System.out.print("Enter your selection: ");
                    int selectYN = InputAndCheckPerson.checkSelection(2);
                    switch (selectYN) {
                        case 1:
                            employeeRepository.edit(id, employeeList, employee);
                            System.out.println("Successful edit!");
                            break;
                        case 2:
                            break;
                    }
            }
        } while (select != 10);
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
                if (employeeList.contains(new Employee(id))) {
                    break;
                } else {
                    System.out.println("Not found ID: " + id);
                }
            }
        } while (true);
        employeeRepository.delete(id, employeeList);
        System.out.println("Successful remove!");
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name you want to search: ");
        String name = scanner.nextLine();
        List<Employee> employees = employeeRepository.search(name, employeeList);
        if (employees.size() == 0) {
            System.out.println("Not found employee with the name: " + name);
        } else {
            System.out.println("List of employees with the name: " + name);
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
