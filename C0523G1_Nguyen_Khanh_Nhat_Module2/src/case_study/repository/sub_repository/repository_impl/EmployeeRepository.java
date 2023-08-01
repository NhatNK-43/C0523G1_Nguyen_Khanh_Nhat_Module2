package case_study.repository.sub_repository.repository_impl;

import case_study.model.person.Employee;
import case_study.repository.sub_repository.IEmployeeRepository;
import case_study.util.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\case_study\\data\\employee.csv";

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringListEmp = ReadAndWriteFile.readFile(FILE_PATH);
        String[] arrayEmp;
        for (String string : stringListEmp) {
            arrayEmp = string.split(",");
            String id = arrayEmp[0];
            String name = arrayEmp[1];
            LocalDate date = LocalDate.parse(arrayEmp[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String gender = arrayEmp[3];
            String idCard = arrayEmp[4];
            String phoneNumber = arrayEmp[5];
            String email = arrayEmp[6];
            String literacy = arrayEmp[7];
            String position = arrayEmp[8];
            Double salary = Double.parseDouble(arrayEmp[9]);

            Employee employee = new Employee(id, name, date, gender, idCard, phoneNumber, email, literacy, position, salary);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInformToCsv());
        ReadAndWriteFile.writeFile(FILE_PATH, stringList, true);
    }

    @Override
    public void edit(String id, List<Employee> employeeList, Employee employee) {
        List<String> stringList = new ArrayList<>();
        int index = employeeList.indexOf(new Employee(id));
        employeeList.set(index, employee);
        for (Employee emp : employeeList) {
            stringList.add(emp.getInformToCsv());
        }
        ReadAndWriteFile.writeFile(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(String id, List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        int index = employeeList.indexOf(new Employee(id));
        employeeList.remove(employeeList.get(index));
        for (Employee emp : employeeList) {
            stringList.add(emp.getInformToCsv());
        }
        ReadAndWriteFile.writeFile(FILE_PATH, stringList, false);
    }

    @Override
    public List<Employee> search(String name, List<Employee> employeeList) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getName().toLowerCase().contains(name.toLowerCase())) {
                employees.add(emp);
            }
        }
        return employees;
    }
}
