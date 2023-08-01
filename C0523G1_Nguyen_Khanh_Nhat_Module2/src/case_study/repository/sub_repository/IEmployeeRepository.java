package case_study.repository.sub_repository;

import case_study.model.person.Employee;
import case_study.repository.IFuramaRepository;

import java.util.List;

public interface IEmployeeRepository extends IFuramaRepository <Employee> {
    List<Employee> search(String name,List<Employee> employeeList);
}
