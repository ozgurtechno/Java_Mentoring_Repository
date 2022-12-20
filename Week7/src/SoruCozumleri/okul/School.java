package SoruCozumleri.okul;

import java.util.ArrayList;
import java.util.List;

public class School {

    public List<Student> students = new ArrayList<>();
    public List<Teacher> teachers = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", courses=" + courses +
                '}';
    }
}
