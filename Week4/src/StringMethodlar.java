public class StringMethodlar {

    public static void main(String[] args) {

        String cat = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("cat");

        System.out.println(cat==cat2);
        System.out.println(cat.equalsIgnoreCase(cat3));


        String word = "Techno Study";                   //  "T e c h n o   S t u  d  y"
                                                        //   0 1 2 3 4 5 6 7 8 9  10 11

        System.out.println("Kelimenin uzunlugu : " + word.length());
        System.out.println("Kelimenin kucuk harfle yazimi : " + word.toLowerCase());
        System.out.println("Kelimenin buyuk harfle yazimi : " + word.toUpperCase());
        System.out.println("Kelime de karakter var mi? : " + word.isEmpty());
        System.out.println("Kelime sadece bosluktan mi olusuyor? : " + word.isBlank());

        // letter in index 3
        System.out.println("3 numarali index karakteri : " + word.charAt(3));

        // search a letter in a given string
        System.out.println("'h' harfinin indexi : " + word.indexOf("h"));

        // confirm gıven string contains a letter
        System.out.println("'z' harfi bu kelime icerisinde var mi? : " + word.contains("z"));

        // substring
        System.out.println(word.substring(0,6));

        // substring
        System.out.println(word.substring(6));

        // trim
        System.out.println(word.substring(6).trim());


        // Reference Data Types ---------------------------------------------------------------------------------------

        String wor = "Hello";
        String word2 = "Hello";

        boolean isEqual = wor == word2;
        System.out.println("Two words equal? " + isEqual);

        String word3 = new String("Hello World");
        System.out.println(word3);

        boolean isEqual2 = wor == word3;
        System.out.println("Are they equal? " + isEqual2);

        boolean isEqual3 = wor.equals(word3);
        boolean isEqual4 = wor.equalsIgnoreCase(word3);
        System.out.println("Are they equal? " + isEqual3);

        System.out.println("------------------------------ Ornek 4 --------------------------------------");

        // Example  : convert to string
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        String str = new String(ch);
        System.out.println(str);

        // valueOf
        String str2 = String.valueOf(ch);
        System.out.println(str2);
    }
}
