package case_study.model.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employee extends Person {
    private String literacy;
    private String position;
    private Double salary;

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(){

    }
    public Employee(String id) {
        super(id);
    }

    public Employee(String literacy, String position, Double salary) {
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, LocalDate date, String gender, String idCard, String phoneNumber, String email, String literacy, String position, Double salary) {
        super(id, name, date, gender, idCard, phoneNumber, email);
        this.literacy = literacy;
        this.position = position;
        this.salary = salary;
    }

    public String getInformToCsv() {
        return this.getId() + "," +
                this.getName() + "," +
                this.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," +
                this.getGender() + "," +
                this.getIdCard() + "," +
                this.getPhoneNumber() + "," +
                this.getEmail() + "," +
                this.literacy + "," +
                this.position + "," +
                this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", literacy='" + literacy + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;
        return Objects.equals(super.getId(), employee.getId());
    }
}
