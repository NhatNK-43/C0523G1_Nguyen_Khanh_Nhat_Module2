package ss05_access_modifier.exercise.exe2;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this("John", "C02");
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName (){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getClasses(){
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

}
