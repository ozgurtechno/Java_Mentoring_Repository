package SoruCozumleri;

import java.util.HashMap;
import java.util.Map;

public class MapSoruCozumu {

    public static void main(String[] args) {

        // TODO MapSoru -> Verilen Bir String de her harfin kac defa tekrar ettigini bulan bir method yaziniz...
        String word = "Merhaba Dunya";
        findFrequencyOfLetters(word);
        System.out.println("findFrequencyOfLetters2(word) = " + findFrequencyOfLetters2(word));
    }


    private static void findFrequencyOfLetters(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : word.toCharArray()) {

            if (map.containsKey(ch)){

                map.put( ch , map.get(ch) + 1);

            } else {

                map.put( ch , 1 );
            }


        }

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
