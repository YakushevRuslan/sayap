package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriterData {
    public void write(String path, ArrayList<String> data) throws IOException {
        File directory = new File(path);
        if (path.length() > 0 && !directory.exists()) {
            directory.mkdirs();
            System.out.println("directory created");
        }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, false))) {

                for (int i = 0; i < data.size(); i++) {
                    writer.write(data.get(i) + "\n");
                }
                System.out.printf("file the %s is written", path);
            }
    }
}
