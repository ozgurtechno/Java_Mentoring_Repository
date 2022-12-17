import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_Demo {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key1", "Value3");

        // Key vasitasiyla Value ya ulasmak...
        map.get("Key1");

        // Value vasitasiyla Key'e ulasmak normalde java da tanimli degildir... Sadece foreach dongusunde mevcuttur..
        getKey(map, "Value1");

        // Bir Map icerisinde dalosmak...

        for (int i = 0; i < map.size(); i++) {
            // Maplerde index olmaz... O yuzden for dongusu kullanmak mantikli degildir....
            System.out.println("map.get(i) = " + map.get(i));
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

        // TODO MapSoru -> Verilen Bir String de her harfin kac defa tekrar ettigini bulan bir method yaziniz...
        String word = "Merhaba Dunya";

        // Bu method developer ogrencileri icin buraya konmustur.. Stream ile map icerisinde dolasmak...
        map.forEach((k,v) -> System.out.println(k + v));
    }

    // <K , V> degerleri Java da GENERICS olarak genel tip leri tanimlamak icin kullanilir...
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
