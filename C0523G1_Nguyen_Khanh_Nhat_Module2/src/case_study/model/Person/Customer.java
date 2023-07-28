package case_study.model.Person;

import java.util.Date;

public class Customer extends Person {
    private String customerType;
    private String address;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, Date date, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        super(id, name, date, gender, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
