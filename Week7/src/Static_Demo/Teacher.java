package Static_Demo;

public class Teacher {

    private String firstName;
    private String lastName;
    private String course;

    public static int teacherCount = 0;

    public Teacher(String firstName, String lastName, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        teacherCount++;
    }

   // -------------------------- Getters and Setters ----------------------------------------------

    public static int getTeacherCount(){
        return teacherCount;
    }

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
