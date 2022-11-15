public class StringMethodlar {

    public static void main(String[] args) {


        String word = "Techno Study";                   //  "T e c h n o   S t u  d  y"
                                                        //   0 1 2 3 4 5 6 7 8 9  10 11

        System.out.println("Kelimenin uzunlugu : " + word.length());
        System.out.println("Kelimenin kucuk harfle yazimi : " + word.toLowerCase());
        System.out.println("Kelimenin buyuk harfle yazimi : " + word.toUpperCase());
        System.out.println("Kelime de karakter var mi? : " + word.isEmpty());
        System.out.println("Kelime sadece bosluktan mi olusuyor? : " + word.isBlank());

        // Kelimenin 3 uncu indexindeki karakteri yazdiralim
        System.out.println("3 numarali index karakteri : " + word.charAt(3));

        // Kelimenin icerisinde 'h' harfinin indexini yazdiralim
        System.out.println("'h' harfinin indexi : " + word.indexOf("h"));

        // Kelime icerisinde 'z' harfi var mi ?
        System.out.println("'z' harfi bu kelime icerisinde var mi? : " + word.contains("z"));

        // Kelime icerisinden 'Techno' bolumunu ekrana yazdiralim
        System.out.println(word.substring(0,6));

        // Kelime icerisinden 'Study' bolumunu ekrana yazdiralim
        System.out.println(word.substring(6));

        // Yazdiracagimiz kelimenin sagindaki ve solundaki bosluklari temizleyelim
        System.out.println(word.substring(6).trim());
    }
}
