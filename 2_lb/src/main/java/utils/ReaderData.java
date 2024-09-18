package utils;

import java.io.*;
import java.util.ArrayList;

public class ReaderData {
    public ArrayList<String> read (String path) {
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);
        if (file.exists() && file.length() > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String readStr = "";
                while ((readStr = reader.readLine()) != null) {
                    data.add(readStr);
                }
                System.out.printf("file the %s is read\n", path);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("file not found or file is empty");
        }
        return data;
    }
}