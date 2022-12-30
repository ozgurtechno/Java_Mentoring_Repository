package Static_Demo;

public class Student {

    // --------------------------------- FIELDS --------------------------------------------------------------------

    private String firstName;
    private String lastName;
    private int schoolNumber;
    private int phoneNumber;

//    public static int studentCount;

    // --------------------------------- CONSTRUCTOR --------------------------------------------------------------------


    public Student(String firstName, String lastName, int schoolNumber, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolNumber = schoolNumber;
        this.phoneNumber = phoneNumber;
//        studentCount++;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        studentCount++;
    }

    public Student(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
//        studentCount++;
    }

    // --------------------------------- METHODS --------------------------------------------------------------------

    public void addStudent(String firstName, String lastName){
        // Bu classtan olusturulmus ogrenci miktarini nasil sayabilirim...
//        studentCount++;
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
}
