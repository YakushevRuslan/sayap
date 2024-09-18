package utils;

import models.Student;

import java.util.ArrayList;

public class FilterStudent {
    public static void deleteStudent(ArrayList<Student> students, int averageScore){
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).averageScore() < 3){
                System.out.printf("Студент : %s  удален c %d курса. \n",students.get(i).getName(), students.get(i).getCourse());
                students.remove(i);
            }
            else if(students.get(i).getCourse() < 5){
                int course = students.get(i).getCourse();
                students.get(i).setCourse(course + 1 );
                System.out.printf("Студент : %s переведен на курс %d .\n",students.get(i).getName(), students.get(i).getCourse());
            }
        }
    }

    public static ArrayList<Student> getStudentsFromCourse(ArrayList<Student> students, int course){
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getCourse() == course){
                result.add(students.get(i));
            }
        }
        return result;
    }


}
