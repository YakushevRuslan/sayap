import java.util.ArrayList;
import java.util.List;

public class Deanery {
    private List<Student> students;

    public Deanery() {
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) { students.remove(student);}

    public int getQuantityStudents() {
        return students.size();
    }

    public Student findSudentByName(String firstName, String secondName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudents() {
        return students;
    }

    // расчет среднего балла всех студентов
    public double getAverageMark() {
        double averageMark = 0;
        for (Student student : students) {
            averageMark += student.getAverageMark();
        }
        return averageMark / students.size();
    }

    public boolean searchStudent(Student student) {
        return students.contains(student);
    }

    public void clearListStudents() {
        students.clear();
    }

    // подсчет количества студентов с заданным баллом
    public int countStudentsByMark(double mark) {
        int sum = 0;
        for (Student student : students) {
            if (student.getAverageMark() == mark) {
                sum++;
            }
        }
        return sum;
    }

    // получение списка парней
    public List<Student> getAllMans() {
        List<Student> mans = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().toLowerCase().equals("male")) {
                mans.add(student);
            }
        }
        return mans;
    }

    // получение списка девушек
    public List<Student> getAllWomans() {
        List<Student> womans = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().toLowerCase().equals("female")) {
                womans.add(student);
            }
        }
        return womans;
    }

    public void setCourseStudent(Student student,int course) {
        student.setCourse(course);
    }
    public int getCourseStudent(Student student){
        return student.getCourse();
    }
    public void setFaculty(Student student, String faculity){
        student.setFaculty(faculity);
    }
}


