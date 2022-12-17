package SoruCozumleri.okul;

public class Okul_DEMO {

    public static void main(String[] args) {

        Address adres = new Address();
        adres.address = "Java cok guzel, Ogreniyorum Sok...";
        adres.city = "Ankara";
        adres.zipCode = 10001;

        Teacher teacher = new Teacher();
        teacher.firstName = "Ismet";
        teacher.lastName = "Ozgur";
        teacher.adres = adres;

        Course ders = new Course();
        ders.name = "Java";
        //ders.teacher = teacher;

        Student student = new Student();
        student.adres = adres;
        student.firstName = "Ali";
        student.lastName = "Veli";
        student.grade = 4;

        teacher.ders = ders;
        student.dersler.add(ders);


        School okul = new School();
        okul.students.add(student);
        okul.courses.add(ders);
        okul.teachers.add(teacher);


        System.out.println(okul);
    }


}
