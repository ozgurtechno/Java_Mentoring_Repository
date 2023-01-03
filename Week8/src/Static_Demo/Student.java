package Static_Demo;

public class Student {

    // --------------------------------- FIELDS --------------------------------------------------------------------

    private String firstName;
    private String lastName;
    private int schoolNumber;
    private int phoneNumber;

    private static int studentCount;

    // --------------------------------- CONSTRUCTOR --------------------------------------------------------------------


    public Student(String firstName, String lastName, int schoolNumber, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolNumber = schoolNumber;
        this.phoneNumber = phoneNumber;
        studentCount++;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
    }

    public Student(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        studentCount++;
    }

    // --------------------------------- METHODS --------------------------------------------------------------------

    public static int getStudentCount(){
        // Bu classtan olusturulmus ogrenci miktarini nasil sayabilirim...
        return studentCount;
    }


    // --------------------------------- TO String Method ------------------------------------------------------------


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    // --------------------------------- TO String Method ------------------------------------------------------------


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
