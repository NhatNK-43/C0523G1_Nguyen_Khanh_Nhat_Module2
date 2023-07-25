package ss16_io_text_file.exercise.execise2;

public class Main {
    public static void main(String[] args) {
        final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss16_io_text_file\\exercise\\execise2\\Country.csv";
        FileUtil fileUtil = new FileUtil();
        System.out.println("ID   CODE      NAME");
        System.out.println("-------------------");
        for (Country country: fileUtil.readFile(FILE_PATH)){
            System.out.println(country);
        }
    }
}
