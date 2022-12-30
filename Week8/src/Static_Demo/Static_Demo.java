package Static_Demo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Static_Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String firstName = scanner.next();

        System.out.println("Lutfen SoyIsminizi giriniz");
        String lastName = scanner.next();

        System.out.println("Lutfen Okul Numaranizi giriniz");
        String girdi = scanner.next();
        int okulNo = UtilityClass.convertToInteger(girdi);

        Student student = new Student("Ahmet", "Mehmet", okulNo);

        System.out.println(student);


    }
}
