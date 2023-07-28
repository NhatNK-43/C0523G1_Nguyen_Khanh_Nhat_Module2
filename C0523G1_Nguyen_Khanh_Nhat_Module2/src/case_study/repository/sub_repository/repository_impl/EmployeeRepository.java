package case_study.repository.sub_repository.repository_impl;

import case_study.common.CheckDate;
import case_study.model.Person.Employee;
import case_study.repository.sub_repository.IEmployeeRepository;
import case_study.util.ReadAndWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\case_study\\data\\data_file.csv";
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> findAll() {
        List<String> stringListEmp = ReadAndWriteFile.readFile(FILE_PATH);
        String[] arrayEmp;
        for (String string : stringListEmp) {
            arrayEmp = string.split(",");
            String id = arrayEmp[0];
            String name = arrayEmp[1];
            Date date = CheckDate.checkDate(arrayEmp[2]);
            String gender = arrayEmp[3];
            String idCard = arrayEmp[4];
            String phoneNumber = arrayEmp[5];
            String email = arrayEmp[6];
            String literacy = arrayEmp[7];
            String position = arrayEmp[8];
            Double salary   = Double.parseDouble(arrayEmp[9]);

            Employee employee = new Employee(id, name, date, gender, idCard, phoneNumber, email,literacy,position,salary);
            employeeList.add(employee);
            LocalDate date1 = LocalDate(arrayEmp[2]);
        }
        return employeeList;
    }

    @Override
    public void addEmp(Employee employee) {

    }

    @Override
    public void editEmp(String id) {

    }

    @Override
    public void removeEmp(String id) {

    }

    @Override
    public List<String> searchEmp(String name) {
        return null;
    }
}
