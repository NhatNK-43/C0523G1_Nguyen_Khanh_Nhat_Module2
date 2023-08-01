package case_study.repository.sub_repository.repository_impl;

import case_study.model.person.Customer;
import case_study.repository.sub_repository.ICustomerRepository;
import case_study.util.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\case_study\\data\\customer.csv";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
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
            String customerType = arrayEmp[7];
            String address = arrayEmp[8];

            Customer Customer = new Customer(id, name, date, gender, idCard, phoneNumber, email, customerType, address);
            customerList.add(Customer);
        }
        return customerList;
    }

    @Override
    public void add(Customer Customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(Customer.getInformToCsv());
        ReadAndWriteFile.writeFile(FILE_PATH, stringList, true);
    }

    @Override
    public void edit(String id, List<Customer> customerList, Customer Customer) {
        List<String> stringList = new ArrayList<>();
        int index = customerList.indexOf(new Customer(id));
        customerList.set(index, Customer);
        for (Customer cus : customerList) {
            stringList.add(cus.getInformToCsv());
        }
        ReadAndWriteFile.writeFile(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(String id, List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        int index = customerList.indexOf(new Customer(id));
        customerList.remove(customerList.get(index));
        for (Customer cus : customerList) {
            stringList.add(cus.getInformToCsv());
        }
        ReadAndWriteFile.writeFile(FILE_PATH, stringList, false);
    }

    @Override
    public List<Customer> search(String name, List<Customer> customerList) {
        List<Customer> customers = new ArrayList<>();
        for (Customer cus : customerList) {
            if (cus.getName().toLowerCase().contains(name.toLowerCase())) {
                customers.add(cus);
            }
        }
        return customers;
    }
}
