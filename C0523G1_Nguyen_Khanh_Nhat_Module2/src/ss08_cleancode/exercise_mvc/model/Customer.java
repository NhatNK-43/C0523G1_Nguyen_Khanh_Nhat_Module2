package ss08_cleancode.exercise_mvc.model;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String typeCustomer;

    public Customer(int id, String name, int age, String typeCustomer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.typeCustomer = typeCustomer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}
