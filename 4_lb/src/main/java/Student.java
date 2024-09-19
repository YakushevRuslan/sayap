public class Student {
    private  String firstName;
    private  String secondName;
    private  String gender;
    private int course;
    private String faculty;
    private double averageMark;


    public Student(String firstName, String secondName, String gendor, int course, String faculty){
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gendor;
        this.course = course;
        this.faculty = faculty;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
