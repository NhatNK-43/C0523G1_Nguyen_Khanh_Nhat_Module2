package ss17_io_binaryfile_serialization.exercise.exercise1.util;

import ss17_io_binaryfile_serialization.exercise.exercise1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void writeFile(String path, List<Product> products) {
        try (
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {

            oos.writeObject(products);

        } catch (FileNotFoundException e) {
            System.out.println("Path not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        }

    }

    public static List<Product> readFile(String path) {
        List<Product> productList = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {

            productList = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
        return productList;
    }
}
