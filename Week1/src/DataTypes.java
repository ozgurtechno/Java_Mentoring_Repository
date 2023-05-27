public class DataTypes {
    public static void main(String[] args) {

        // Primitive Data Types ---------------------------------------------------------------------------------------

        byte    b = 122;                     // 1 byte
        short   s = 22222;                   // 2 bytes
        int     i = 1222222222;              // 4 bytes
        long    l = 2222222222222222222L;    // 8 bytes

        // 8 bytes
        double  d  = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0;
        double  d1 = 1.7976931348623157E308;
        //System.out.println(Double.MAX_VALUE);

        // 4 bytes
        float   f  = 340282346638528860000000000000000000000.000000f;
        float   f1 = 3.4028235E38f;
        //System.out.println(Float.MAX_VALUE);

        boolean isOkey = true;

        char ch  = 'a';
        char ch2 = 'A';

        System.out.println("character = "+ (ch * ch2));
        System.out.println(ch);
        System.out.println(67+7);




        int x = 554;
        long y = x;


    }
}
