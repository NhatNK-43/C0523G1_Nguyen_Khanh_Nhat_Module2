package ss16_io_text_file.exercise.execise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public List<Country> readFile(String pathRead) {
        List<Country> countryList = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(pathRead);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                Country country = new Country(id, code, name);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        }
        return countryList;
    }
}
