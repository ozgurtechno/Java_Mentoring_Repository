package Tasks.school;

public class Okul_DEMO {

    public static void main(String[] args) {

        Address adres = new Address();
        adres.address = "Hello World Dr";
        adres.city = "Washington";
        adres.zipCode = 10001;

        Teacher teacher = new Teacher();
        teacher.firstName = "Azamat";
        teacher.lastName = "Ozgur";
        teacher.address = adres;

        Course ders = new Course();
        ders.name = "Java";
        ders.teacher = teacher;

        Student student = new Student();
        student.adres = adres;
        student.firstName = "Ali";
        student.lastName = "Veli";
        student.grade = 4;

        teacher.course = ders;
        student.dersler.add(ders);


        School school = new School();
        school.students.add(student);
        school.courses.add(ders);
        school.teachers.add(teacher);


        System.out.println(school);
    }


}
