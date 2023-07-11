package ss05_access_modifier.exercise.exe2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Student:\n+ Name: "+student.getName()+
                "\n+ Class: "+student.getClasses());

        student.setName("Mia");
        student.setClasses("C05");

        System.out.println("Student:\n+ Name: "+student.getName()+
                "\n+ Class: "+student.getClasses());
    }

}
