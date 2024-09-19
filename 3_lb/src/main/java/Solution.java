import models.Person;
import models.Student;
import utils.FilterStudent;
import utils.ReadStudent;

import java.util.ArrayList;
import java.util.HashSet;

import static utils.FilterStudent.printStudents;

public class Solution {
    public static void main(String[] args) {
        //3
        /*коллекция HashSet хранит уникальные значения,
            в примере добавлен повторяющийся объект.
            Переопределим методы сравнения для корректной работы.
         */
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.print(set.size());

        //4.1
        System.out.println("************  4.1  *******************");

        ArrayList<Student> students = ReadStudent.read("/home/ruslan/Projects/Institut/sayap/3_lb/src/students.txt");
        for (Student s : students) {
            System.out.println(s.toString());
        }

        FilterStudent.deleteStudent(students, 3);
        
        //4.2
        System.out.println("************  4.2  *******************");
        printStudents(students);

    }
}
