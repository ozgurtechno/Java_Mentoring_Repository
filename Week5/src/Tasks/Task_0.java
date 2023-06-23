package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_0 {

    public static void main(String[] args) {

        System.out.println("------------------------------ Ornek 1 --------------------------------------");

        // TODO Soru - 1 : Bir Array i nasil Arraylist e donusturebilriz?....
        String[] arr = { "Java", "Python", "C++" };
        System.out.print("Array: ");

        for (String str : arr) {
            System.out.print(str);
            System.out.print(" ");
        }

        ArrayList<String> language = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\nArrayList: " + language);

        System.out.println("------------------------------ Ornek 2 --------------------------------------");

        // TODO Soru - 2 : Bir Arraylist i Array e nasil donustururuz?.....
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Phyton", "C++"));
        System.out.println("ArrayList: " + languages);

        String[] array = new String[languages.size()];
        languages.toArray(array);
        System.out.print("Array: ");

        for (String item : array) {
            System.out.print(item + ", ");
        }

    }
}
