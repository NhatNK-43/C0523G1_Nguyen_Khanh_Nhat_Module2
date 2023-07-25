package ss16_io_text_file.practice.practice1;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss16_io_text_file\\practice\\practice1\\file.txt";
        readFileExample(FILE_PATH);
    }
    public static void readFileExample(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);

            String line;
            int sum = 0;
            boolean flag = false;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
                try{
                    sum += Integer.parseInt(line);
                } catch (NumberFormatException e){
                    System.out.println("Error entering numbers into letters!");
                    flag = true;
                }
            }
            buff.close();
            if (!flag){
                System.out.println("Sum: " + sum);
            }
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }
    }
}
