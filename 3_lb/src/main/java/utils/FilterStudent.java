package utils;

import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

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

    public static void printStudents(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                int courseCompare = Integer.compare(s1.getCourse(), s2.getCourse());
                if (courseCompare != 0) {
                    return courseCompare;
                }
                int groupCompare = s1.getGroup().compareTo(s2.getGroup());
                if (groupCompare != 0) {
                    return groupCompare;
                }
                return s1.getName().compareTo(s2.getName());
            }
        });


        for (Student student : students) {
            StringBuilder sb = new StringBuilder();
            sb.append("Курс: " + student.getCourse() + "\n");
            sb.append("Группа: " + student.getGroup() + "\n");
            sb.append("Студент: " + student.getName() + "\n");

            System.out.println(sb.toString());
        }
    }
}
