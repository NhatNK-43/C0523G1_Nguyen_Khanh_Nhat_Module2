package case_study.service.sub_service.impl;

import case_study.model.Person.Employee;
import case_study.repository.sub_repository.IEmployeeRepository;
import case_study.repository.sub_repository.repository_impl.EmployeeRepository;
import case_study.service.sub_service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void displayEmp() {
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }
}
