package Tasks.school;

public class Course {

    public String name;
    public Teacher teacher;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
