package models;

public class Schoolboy {
    private String firstName;
    private String secondName;
    private int numberClass;

    public Schoolboy(String firstName, String secondName, short numberClass) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.numberClass = numberClass;
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

    public int getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(int numberClass) {
        this.numberClass = numberClass;
    }

    public void printInfo(){
        System.out.printf("first name : %s, second name : %s, number class : %d",
                firstName,secondName,numberClass);
    }
}
