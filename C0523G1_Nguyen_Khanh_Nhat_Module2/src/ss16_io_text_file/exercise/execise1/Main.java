package ss16_io_text_file.exercise.execise1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        final String FILE_PATH_READ = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss16_io_text_file\\exercise\\execise1\\source_file.csv";
        final String FILE_PATH_WRITE = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss16_io_text_file\\exercise\\execise1\\"+fileName;
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.readFile(FILE_PATH_READ);
        copyFileText.writeFile(FILE_PATH_READ,FILE_PATH_WRITE);
    }
}
