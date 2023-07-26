package ss17_io_binaryfile_serialization.exercise.exercise2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileBinary {

    static final String SOURCE_FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss17_io_binaryfile_serialization\\exercise\\exercise2\\source_file.dat";
    static final String TARGET_FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss17_io_binaryfile_serialization\\exercise\\exercise2\\target_file.dat";

    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

       // writeFile(SOURCE_FILE_PATH,students);
        writeFile(TARGET_FILE_PATH,readFile(SOURCE_FILE_PATH));

        for (Student student:readFile(TARGET_FILE_PATH)){
            System.out.println(student);
        }
    }

    public static void writeFile(String targetFilePath, List<Student> students) {
        try (
                FileOutputStream fos = new FileOutputStream(targetFilePath);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {

            oos.writeObject(students);

        } catch (FileNotFoundException e) {
            System.out.println("Path not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        }

    }

    public static List<Student> readFile(String sourceFilePath) {
        List<Student> studentList = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(sourceFilePath);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {

            studentList = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
        return studentList;
    }
}
