package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Student {
    private String name;
    private String group;
    private int course;
    private HashMap<String, Integer> grades = new HashMap<>();

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public void setGrade(String subject, int grade) {
        if (grade > 0 && grade < 6) {
            grades.put(subject, grade);
        } else {
            throw new IllegalArgumentException("Оценка должна быть от 1 до 5");
        }
    }

    public double getGrade(String subject) {
        return grades.getOrDefault(subject, 0);
    }

    public void setCourse(int course) {
        if (course > 0 && course < 6) {
            this.course = course;
        } else {
            throw new IllegalArgumentException("Курс должен быть от 1 до 5");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public String getGroup(){
        return group;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Студент: " + name + "\n");
        sb.append("Группа: " + group + "\n");
        sb.append("Курс: " + course + "\n");
        for (HashMap.Entry<String, Integer> entry : grades.entrySet()) {
            sb.append("\t" + entry.getKey() + ": " + entry.getValue() + "\n");
        }
        return sb.toString();
    }

    public int averageScore(){
        int sum = 0;
        for (HashMap.Entry<String, Integer> entry : grades.entrySet()) {
            sum += entry.getValue();
        }
        return sum / grades.size();
    }
}
