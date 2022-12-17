import java.util.*;

public class Arraylist_Demo {

    public static void main(String[] args) {

         int[] number = new int[10];
        ArrayList<Integer> numbers = new ArrayList<>(4);  //      \  \  \  \ Big O notation... Time complexity | Space Complexity
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println(numbers2);


        int[] numbers6 = {1,2,3,4};
        Integer[] numbers7 = {1,2,3,4};
        ArrayList<Integer> deneme = new ArrayList<>(Arrays.asList(numbers7));
        for (Integer integer : deneme) {
            System.out.println(integer);
        }

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(10,20,30));
        ArrayList<Integer> numbers4 = new ArrayList<>(List.of(30,20,10));


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        numbers3.addAll(numbers);
        System.out.println("numbers3 = " + numbers3);

        numbers3.clear();
        System.out.println("numbers3 = " + numbers3);

        System.out.println("numbers3.isEmpty() = " + numbers3.isEmpty());

        numbers2.remove(1);
        System.out.println("numbers2 = " + numbers2);

        numbers.removeAll(numbers2);
        System.out.println("numbers = " + numbers);

        // Henuz Interface ogrenmediginiz icin burada bahsetmem gereken cok onemli bir konuya girmiyorum...
        Collections.sort(numbers2);
        System.out.println("numbers4 = " + numbers2);

        System.out.println(numbers2.get(1));
        System.out.println(numbers.get(0));

        // 2 boyutlu ArrayList

        ArrayList < ArrayList<Integer> > numberList = new ArrayList<>();
        numberList.add(numbers2);
        numberList.add(numbers3);
        numberList.add(numbers2);
        System.out.println(numberList);

        ArrayList<Integer> nubbb = new ArrayList<>(Arrays.asList(10,20,30));
        ArrayList<Integer> kx = new ArrayList<>(Arrays.asList(150,520,430));

        ArrayList < ArrayList<Integer> > numberList2 = new ArrayList<>();

        numberList2.add(nubbb);
        numberList2.add(kx);

        // Soru - 1 : TODO Bir Array i nasil Arraylist e donusturebilriz?....
        String[] arr = { "Java", "Python", "C++" };

        // Soru - 2 : TODO Bir Arraylist i Array e nasil donustururuz?.....
        ArrayList<String> diller = new ArrayList<>(Arrays.asList("Java", "Phyton", "C++"));

    }
}
