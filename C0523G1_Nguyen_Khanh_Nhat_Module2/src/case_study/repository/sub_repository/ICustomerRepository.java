package case_study.repository.sub_repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.IFuramaRepository;

import java.util.List;

public interface ICustomerRepository extends IFuramaRepository<Customer> {
    List<Customer> search(String name, List<Customer> employeeList);
}
