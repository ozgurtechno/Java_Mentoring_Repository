package _02_Week;

public class _20_Soru {

    /*

        boolean true1 =  true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        System.out.print( (true1 || true2)+" ");
        System.out.print( (true1 || false1)+" " );
        System.out.print( false1 || false2 );


        Yukarıdaki kod parçasının çıktısı ne olur?



        Cevap = "true true false"


     */

    public static void main(String[] args) {


        boolean true1 =  true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        System.out.print( (true1 || true2)+" "); // true yada true = true
        System.out.print( (true1 || false1)+" " ); // true yada false = true
        System.out.print( false1 || false2 );  // false yada false = false


    }
}
