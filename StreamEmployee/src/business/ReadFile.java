package business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readFileDatas() {
        String pathName = "/home/lucas/Desktop/out/file.csv";
        List<String> datas = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(pathName))) {
            String line = br.readLine();

            while(line != null){
                datas.add(line);
                line = br.readLine();
            }
            return datas;

        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
