import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class DeaneryTest {
    private Deanery deanery;

    @BeforeEach
    void setUp() {
        deanery = new Deanery();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addStudent() {
        Student student = new Student("Ivan","Ivanov","Male",2,"FIT");
        deanery.addStudent(student);

        assertEquals(1, deanery.getQuantityStudents());
        assertTrue(deanery.searchStudent(student));
    }

    @Test
    void removeStudent() {
        Student student = new Student("Jane", "Smith", "female", 3,"FIT");
        deanery.addStudent(student);

        deanery.removeStudent(student);

        assertEquals(0, deanery.getQuantityStudents());
        assertFalse(deanery.searchStudent(student));
    }

    @Test
    void getQuantityStudents() {
        Student student1 = new Student("John", "Doe", "male", 1, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 3, "FIT");
        Student student3 = new Student("Alice", "Johnson", "female", 4, "FIT");

        deanery.addStudent(student1);
        deanery.addStudent(student2);
        deanery.addStudent(student3);
        assertEquals(3,deanery.getQuantityStudents());

    }

    @Test
    void findSudentByName() {
        Student student1 = new Student("John", "Doe", "male", 4, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 3,"FIT");
        deanery.addStudent(student1);
        deanery.addStudent(student2);

        Student foundStudent = deanery.findSudentByName("John", "Doe");

        assertEquals(student1, foundStudent);
    }

    @Test
    void getStudents() {
        Student student1 = new Student("John", "Doe", "male", 2, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 1, "FIT");
        deanery.addStudent(student1);
        deanery.addStudent(student2);

        List<Student> students = deanery.getStudents();

        assertEquals(2, students.size());
        assertTrue(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    void getAverageMark() {
        Student student1 = new Student("John", "Doe", "male", 4, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 1, "FIT");
        student1.setAverageMark(3.2);
        student2.setAverageMark(4.5);
        deanery.addStudent(student1);
        deanery.addStudent(student2);

        double averageMark = deanery.getAverageMark();

        assertEquals(3.85, averageMark, 0.01);
    }

    @Test
    void searchStudent() {Student student = new Student("Ivan", "Petrov", "male", 3, "FIT");

        deanery.addStudent(student);

        assertTrue(deanery.searchStudent(student));

        deanery.removeStudent(student);

        assertFalse(deanery.searchStudent(student));
    }

    @Test
    void clearListStudents() {
        Student student1 = new Student("John", "Doe", "male", 2, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 1, "FIT");
        deanery.addStudent(student1);
        deanery.addStudent(student2);

        deanery.clearListStudents();

        assertEquals(0, deanery.getQuantityStudents());
        assertFalse(deanery.searchStudent(student1));
        assertFalse(deanery.searchStudent(student2));
    }

    @Test
    void countStudentsByMark() {
        Student student1 = new Student("John", "Doe", "male", 5, "GIS");
        Student student2 = new Student("Jane", "Smith", "female", 4, "GIS");
        Student student3 = new Student("Bob", "Johnson", "male", 4, "FIT");
        student1.setAverageMark(3.2);
        student2.setAverageMark(4.5);
        student3.setAverageMark(4.5);
        deanery.addStudent(student1);
        deanery.addStudent(student2);
        deanery.addStudent(student3);

        int count = deanery.countStudentsByMark(4.5);

        assertEquals(2, count);
    }

    @Test
    void getAllMans() {
        Student student1 = new Student("John", "Doe", "male", 2, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 1, "FIT");
        Student student3 = new Student("Bob", "Johnson", "male", 4, "FIT");

        deanery.addStudent(student1);
        deanery.addStudent(student2);
        deanery.addStudent(student3);

        List<Student> mans = deanery.getAllMans();

        assertEquals(2, mans.size());
        assertTrue(mans.contains(student1));
        assertTrue(mans.contains(student3));
    }

    @Test
    void getAllWomans() {
        Student student1 = new Student("John", "Doe", "male", 1, "FIT");
        Student student2 = new Student("Jane", "Smith", "female", 3, "FIT");
        Student student3 = new Student("Alice", "Johnson", "female", 4, "FIT");

        deanery.addStudent(student1);
        deanery.addStudent(student2);
        deanery.addStudent(student3);

        List<Student> womans = deanery.getAllWomans();

        assertEquals(2, womans.size());
        assertTrue(womans.contains(student2));
        assertTrue(womans.contains(student3));
    }

    @Test
    void setCourseStudent() {
        Student student1 = new Student("John", "Doe", "male", 1, "FIT");
        deanery.setCourseStudent(student1,5);
        assertEquals(5, deanery.getCourseStudent(student1));
    }

    @Test
    void getCourseStudent() {
        Student student = new Student("Ivan", "Petrov", "male", 2, "FIT");
        deanery.addStudent(student);

        int course = deanery.getCourseStudent(student);

        assertEquals(2, course);
    }

    @Test
    void setFaculty() {
        Student student1 = new Student("John", "Doe", "male", 1, "MIT");
        deanery.setFaculty(student1,"FIT");
        assertEquals("FIT", student1.getFaculty());
    }
}