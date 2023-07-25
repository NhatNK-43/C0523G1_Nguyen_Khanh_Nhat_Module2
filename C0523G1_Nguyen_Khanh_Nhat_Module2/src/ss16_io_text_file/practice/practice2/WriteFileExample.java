package ss16_io_text_file.practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFileExample {
    static final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss16_io_text_file\\practice\\practice2\\file.csv";
    static final String FILE_PATH_RESULT ="D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss16_io_text_file\\practice\\practice2\\result.txt";
    public static void main(String[] args) {
        writeFile(FILE_PATH_RESULT);
    }

    public static List<Integer> readFile() {
        List<Integer> integerList = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(FILE_PATH);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                integerList.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File dose not exist!");
        } catch (IOException e) {
            System.out.println("Error content!");
        }
        return integerList;
    }

    public static void writeFile(String path) {
        try (
                FileWriter fileWriter = new FileWriter(path);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            if (readFile().isEmpty()) {
                System.out.println("File is empty!");
            } else {
                bufferedWriter.write("Max: " + max());
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static int max() {
        int max = readFile().get(0);
        for (Integer number : readFile()) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
