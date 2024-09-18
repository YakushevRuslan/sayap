package models;

import java.util.Objects;

public class Person {
    String name;
    public Person(String name) { this.name = name; }
    public String toString() { return name; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        else {
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
