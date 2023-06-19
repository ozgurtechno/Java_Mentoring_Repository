package Tasks.okul;

public class Teacher {

    public String firstName;
    public String lastName;
    public Address adres;
    public Course ders;

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adres=" + adres +
                ", ders=" + ders +
                '}';
    }
}
