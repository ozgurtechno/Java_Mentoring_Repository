package SoruCozumleri;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSoruCozumu {

    public static void main(String[] args) {

        // TODO MapSoru -> Verilen Bir String de her harfin kac defa tekrar ettigini bulan bir method yaziniz...
        String word = "Merhaba Dunya";
        findFrequencyOfLetters(word);
        System.out.println("findFrequencyOfLetters2(word) = " + findFrequencyOfLetters2(word));
    }


    private static void findFrequencyOfLetters(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

//        String ab = "ab";
//        var AB1 = ab.toCharArray();
//        Character[] words = {'a','b'};

        for (Character ch : word.toCharArray()) {

            if (map.containsKey(ch)){           // M -> 1

                map.put( ch , map.get(ch) + 1);  // Daha once eklediysem, eski degeri 1 arttirarak uzerine kaydet...

            } else {

                map.put( ch , 1 );  // Ilk defa karsilasilan harflerin adet bilgisi 1 olarak map e konuldu...
            }

        }

        for (Entry<Character, Integer> each : map.entrySet()) {             // Her ikili bir ENTRY
            System.out.println(each.getKey() + " = "+each.getValue());
        }

        // developer...
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " = "+entry.getValue()));
    }


    private static Map<Character, Integer> findFrequencyOfLetters2(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : word.toCharArray()) {
            map.put( ch , map.getOrDefault(ch, 0) + 1 );
        }

        return map;
    }
}
