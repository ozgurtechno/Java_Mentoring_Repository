package SoruCozumleri.okul;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String firstName;
    public String lastName;
    public int grade;
    public Address adres;
    public List<Course> dersler = new ArrayList<>();

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", adres=" + adres +
                ", dersler=" + dersler +
                '}';
    }
}
