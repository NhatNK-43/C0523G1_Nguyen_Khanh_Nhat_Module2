package ss08_cleancode.exercise_mvc.service;

import ss08_cleancode.exercise_mvc.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    ArrayList<Customer> customerList = new ArrayList<>();
    void displayCustomer();
    void addCustomer(Customer customer);
    void removeCustomer(int id);

    ArrayList<Customer> searchCustomer(String searchName);
}
