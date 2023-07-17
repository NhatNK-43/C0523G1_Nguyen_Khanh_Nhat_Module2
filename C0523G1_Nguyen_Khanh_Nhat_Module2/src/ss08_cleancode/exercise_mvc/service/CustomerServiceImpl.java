package ss08_cleancode.exercise_mvc.service;

import ss08_cleancode.exercise_mvc.model.Customer;
import ss08_cleancode.exercise_mvc.repository.CustomerRepositoryImpl;
import ss08_cleancode.exercise_mvc.repository.ICustomerRepository;

import java.util.ArrayList;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepositoryImpl();
    @Override
    public void displayCustomer() {
        repository.displayCustomer();
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public void removeCustomer(int id) {
        repository.removeCustomer(id);
    }

    @Override
    public ArrayList<Customer> searchCustomer(String name) {
        return repository.searchCustomer(name);
    }
}
