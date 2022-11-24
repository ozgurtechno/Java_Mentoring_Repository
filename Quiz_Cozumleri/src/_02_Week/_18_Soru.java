package _02_Week;

public class _18_Soru {

    /*

        boolean true1 =  true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        System.out.println( true1 && true2 );
        System.out.println( true1 && false1 );
        System.out.println( false1 && false2 );


        Yukarıdaki kod parçasının çıktısı ne olur?

        Cevap = "true false false"


     */

    public static void main(String[] args) {


        boolean true1 = true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        System.out.println(true1 && true2); // true ve true = true
        System.out.println(true1 && false1); // true ve false = false
        System.out.println(false1 && false2); // false ve false = false


    }
}
