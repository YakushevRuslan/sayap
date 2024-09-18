package utils;

import models.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadStudent {
    static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Student> read(String path){

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            int count = 1;
            String str;
            while ((str = br.readLine()) != null){
                String[] tmp = str.split(",");
                String name = tmp[0];
                String group = tmp[1];
                int course = Integer.parseInt(tmp[2]);
                String math = tmp[3];
                String computerScience = tmp[4];
                String physic = tmp[5];
                String databases = tmp[6];
                String testing = tmp[7];
                String web = tmp[8];
                String os = tmp[9];
                String philosophy = tmp[10];

                Student student = new Student(name,group,course);

                students.add(student);

                student.setGrade("Математика",Integer.parseInt(math));
                student.setGrade("Информатика",Integer.parseInt(computerScience));
                student.setGrade("Физика", Integer.parseInt(physic));
                student.setGrade("Базы данных", Integer.parseInt(databases));
                student.setGrade("Тестирование", Integer.parseInt(testing));
                student.setGrade("Веб-технологии", Integer.parseInt(web));
                student.setGrade("Операционные системы", Integer.parseInt(os));
                student.setGrade("Сети", Integer.parseInt(philosophy));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
