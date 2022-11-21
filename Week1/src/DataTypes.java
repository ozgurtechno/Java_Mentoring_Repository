public class DataTypes {
    public static void main(String[] args) {

        // Primitive Data Types ---------------------------------------------------------------------------------------

        byte    b = 122;
        short   s = 22222;
        int     i = 1222222222;
        long    l = 2222222222222222222L;

        double  d  = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0;
        double  d1 = 1.7976931348623157E308;
        //System.out.println(Double.MAX_VALUE);

        float   f  = 340282346638528860000000000000000000000.000000f;
        float   f1 = 3.4028235E38f;
        //System.out.println(Float.MAX_VALUE);

        boolean isOkey = true;
        char ch  = 'a';
        char ch2 = 'A';

        System.out.println("character = "+ (ch * ch2));
        System.out.println(ch);
        System.out.println(67+7);

        // Reference Data Types ---------------------------------------------------------------------------------------

        String word = "Merhaba Dunya";
        String word2 = "Merhaba Dunya";

        boolean isEqual = word == word2;
        System.out.println("Bu iki kelime birbirine esit mi? " + isEqual);

        String word3 = new String("Merhaba Dunya");
        System.out.println(word3);

        boolean isEqual2 = word == word3;
        System.out.println("Bu iki kelime birbirine esit mi? " + isEqual2);

        boolean isEqual3 = word.equals(word3);
        boolean isEqual4 = word.equalsIgnoreCase(word3);
        System.out.println("Bu iki kelime birbirine esit mi? " + isEqual3);


    }
}
