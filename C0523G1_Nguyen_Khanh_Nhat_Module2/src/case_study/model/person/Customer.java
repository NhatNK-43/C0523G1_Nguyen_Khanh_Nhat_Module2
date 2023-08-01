package case_study.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public Customer(String id) {
        super(id);
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, LocalDate date, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        super(id, name, date, gender, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getInformToCsv() {
        return this.getId() + "," +
                this.getName() + "," +
                this.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," +
                this.getGender() + "," +
                this.getIdCard() + "," +
                this.getPhoneNumber() + "," +
                this.getEmail() + "," +
                this.customerType + "," +
                this.address;
    }
    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
