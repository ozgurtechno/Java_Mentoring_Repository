package Tasks.school;

public class Teacher {

    public String firstName;
    public String lastName;
    public Address address;
    public Course course;

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adres=" + address +
                ", ders=" + course +
                '}';
    }
}
