import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_Demo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(20);
        numbers.add(7);
        numbers.add(8);
        numbers.add(8);
        numbers.add(5);
        numbers.add(null);

        // Set Elemanlarina ulasmak icin index kullanilmaz...
        // Hash Function kullanilarak hafizaya yazilir, boylece veriye ulasmak O(1) zamanda olur...
        // numbers.get(0);
        System.out.println("Ekleme sirasi bozulur...");
        for (Integer number : numbers) {
            //if (number == null) continue;
//            if (number == 4) System.out.println(number );
            System.out.print(number+ " | "); // Insert sirasi onemli degildir...Sirali veri alinamaz...RANDOM
        }

        System.out.println();
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " set icinde var.");
            } else {
                System.out.println(i + " set icinde yok.");
            }
        }

        System.out.println("-----------------Linked Hashset---------------------");

        LinkedHashSet<Integer> linkedNumbers = new LinkedHashSet<>();
        linkedNumbers.add(4);
        linkedNumbers.add(20);
        linkedNumbers.add(7);
        linkedNumbers.add(8);
        linkedNumbers.add(8);
        linkedNumbers.add(5);
        linkedNumbers.add(null); // null verilere izin veriliyor...

        for (Integer number : linkedNumbers) {
            System.out.print(number + " | "); // girilen sirada elemanlara ulasilabilir
        }
        // System.out.println(linkedNumbers.get(1)); // index yoktur...

        System.out.println();
        System.out.println("-----------------Tree Set---------------------");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(20);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(8);
        treeSet.add(5);
        //treeSet.add(null);   Null degerlere izin verilmez...

        for (Integer number : treeSet) {
            System.out.print(number + " | "); // girilen sirada elemanlara ulasilamaz...
                                              // Ama elemanlar otomatik olarak sort edilir...
        }

        // Zinhar kullanmayin....
        HashSet hs = new HashSet<>();
        hs.add(12);
        hs.add("12");
        hs.add(3.5);
        hs.add(true);
        System.out.println(hs);

        // Quiz
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Burak");
        hs1.add("Ömer");
        hs1.add("Fatih");
        System.out.println("Remove "+hs1.remove("Burak"));

        if (hs1.remove(0)) {
            System.out.println("Silindi");
        } else
            System.out.println("Böyle bir veri yok.");


    }
}
