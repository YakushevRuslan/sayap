package utils;

import models.Schoolboy;
import java.util.ArrayList;


public class WorkData {
    ArrayList<String> resultData = new ArrayList<>();
    ArrayList<Schoolboy> schoolboys = new ArrayList<Schoolboy>();

    public void filterFromArrayList (ArrayList<String> data, int numberClass ){
        for (int i = 0; i < data.size(); i += 3 ){
            if(Integer.parseInt(data.get(i+2)) == numberClass){
                resultData.add(data.get(i));
                resultData.add(data.get(i + 1));
                resultData.add(data.get(i + 2));
            }
        }
    }

    public void filterFromSchoolboy (ArrayList<Schoolboy> data, int numberClass ){
        for (Schoolboy s : data){
            if(s.getNumberClass() == numberClass){
                resultData.add(s.getFirstName());
                resultData.add(s.getSecondName());
                resultData.add(String.valueOf(s.getNumberClass()));
            }
        }
    }

    public ArrayList<Schoolboy> createdSchoolboys(ArrayList<String> data){
        for (int i = 0; i < data.size(); i += 3 ){
            schoolboys.add(new Schoolboy(data.get(i),data.get(i+1),Short.parseShort(data.get(i+2))));
        }
        return schoolboys;
    }

    public void printResult(){
        for(Schoolboy s : schoolboys){
            s.printInfo();
        }
    }

    public ArrayList<String>  getResultData(){
        return resultData;
    }

}
