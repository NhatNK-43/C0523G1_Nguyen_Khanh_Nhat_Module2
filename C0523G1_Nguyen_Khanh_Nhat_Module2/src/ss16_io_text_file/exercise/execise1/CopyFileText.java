package ss16_io_text_file.exercise.execise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
                ){
            String line;
            int countChar = 0;

            while ((line = bufferedReader.readLine())!=null){
                stringList.add(line);
                countChar += line.length();
            }
            stringList.add("Character in file: "+countChar);

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        } catch (IOException e) {
            System.out.println("Error content!");
        }
        return stringList;
    }

    public void writeFile(String pathRead, String pathWrite) {

        try {
            File file = new File(pathWrite);

            if (file.exists()){
                System.out.println("File already exists!");
                return;
            }

            FileWriter fileWriter = new FileWriter(pathWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String string:readFile(pathRead)){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Error content!");
        }
    }
}
