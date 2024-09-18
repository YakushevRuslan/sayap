import models.Schoolboy;
import utils.ReaderData;
import utils.WorkData;
import utils.WriterData;

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        ReaderData readerData = new ReaderData();
        WorkData workData = new WorkData();
        WriterData writerData = new WriterData();

        ArrayList<String> inputFromFile = readerData.read("/home/ruslan/Projects/Idea/sayap-2Lb/src/input.txt");
        workData.filterFromArrayList(inputFromFile, 5);
        workData.printResult();

        try {
            writerData.write("/home/ruslan/Projects/Idea/sayap-2Lb/src/output.txt",workData.getResultData());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
