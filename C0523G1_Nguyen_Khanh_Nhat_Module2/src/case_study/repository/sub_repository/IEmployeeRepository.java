package case_study.repository.sub_repository;

import case_study.model.Person.Employee;
import case_study.repository.IFuramaRepository;

import java.util.List;

public interface IEmployeeRepository extends IFuramaRepository {
    List<Employee> findAll();
    void addEmp(Employee employee);
    void editEmp(String id);
    void removeEmp(String id);
    List<String> searchEmp(String name);
}
