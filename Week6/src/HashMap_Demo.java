import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_Demo {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Key1", "Value1");   // int hashcode(String key){ verilen key neyse adres ona gore belirlenir, key ayni oldugu muddetce geriye ayni deger doner     }
        map.put("Key2", "Value2");
        map.put("Key1", "Value3");

        HashMap<Character, Integer> map2 = new HashMap<>();
        map2.put('A', 12);
        map2.put('B',9);

        // Key vasitasiyla Value ya ulasmak...
        map.get("Key1");
        System.out.println("map.get('A') = " + map2.get('A'));

        HashMap<Character, HashSet<String>> ogrenciMap = new HashMap<>();
        ogrenciMap.put('A', new HashSet<>(Arrays.asList("Ahmet", "Mehmet")));
        System.out.println(ogrenciMap.get('A'));

        // Value vasitasiyla Key'e ulasmak normalde java da tanimli degildir... Sadece foreach dongusunde yapilabilir..
        getKey1(map2, 12);

        // Bir Map icerisinde dalosmak...

        for (int i = 0; i < map.size(); i++) {
            // Maplerde index olmaz... O yuzden for dongusu kullanmak mantikli degildir....
            System.out.println("map.get(\"Key1\") = " + map.get("Key1"));
        }

        // Map calisma prensibine gore getKey() methodu cagirildiginda value direk olarak gelirken
        // getValue()
        for (Entry<String, String> each : map.entrySet()) {

            System.out.println(map.get("Key1"));
            System.out.println(map.get("Key2"));
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }

        // entrySet
        var entries = map.entrySet();

        // TODO Basit bir soru....

        // TODO MapSoru -> Verilen Bir String de her harfin kac defa tekrar ettigini bulan bir method yaziniz...
        String word = "Merhaba Dunya";

        // Bu method developer ogrencileri icin buraya konmustur.. Stream ile map icerisinde dolasmak...
        map.forEach((k,v) -> System.out.println(k + v));

    } // --Main bitti...

    static Character getKey1(HashMap<Character, Integer> map, Integer value){

        for (Entry<Character, Integer> entry: map.entrySet())
        {
            if (value == entry.getValue()) {
                return entry.getKey();
            }
        }
        return null;
    }

    // <K , V> degerleri Java da GENERICS olarak genel tip leri tanimlamak icin kullanilir...
    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public <T> void getNumber(T value){
        System.out.println(value);
    }
}
