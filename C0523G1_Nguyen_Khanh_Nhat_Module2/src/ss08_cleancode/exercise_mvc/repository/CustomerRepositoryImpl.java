package ss08_cleancode.exercise_mvc.repository;

import ss08_cleancode.exercise_mvc.model.Customer;

import java.util.ArrayList;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private static final int DEFAULT_CAPACITY = 10;
    private static final ArrayList<Customer> customerList = new ArrayList<>(DEFAULT_CAPACITY);


    static {
        Customer customer1 = new Customer(1, "Nguyen A", 50, "VIP");
        Customer customer2 = new Customer(2, "Nguyen B", 25, "Normal");
        Customer customer3 = new Customer(3, "Phan C", 34, "Normal");
        Customer customer4 = new Customer(4, "Nguyen D", 43, "VIP");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
    }

    @Override
    public void displayCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    private int checkId(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removeCustomer(int id) {
        if (checkId(id) != -1) {
            customerList.remove(checkId(id));
        } else {
            System.out.println("Not found Id: " + id);
        }
    }

    @Override
    public ArrayList<Customer> searchCustomer(String searchName) {
        ArrayList<Customer> arrayList = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getName().contains(searchName)) {
                arrayList.add(customer);
            }
        }
        return arrayList;
    }
}