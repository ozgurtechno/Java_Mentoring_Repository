package _03_Week;

public class _12_Soru {
    /*

         if (tecrübeniz>tecrübem) {
            senior=siz; }
         else {
          senior=ben; }

          Cevap = "1. şık".

     */

    public static void main(String[] args) {


        int terubem = 5;
        int tecrubeniz = 3;

        String senior = (tecrubeniz > terubem) ? "siz" : "ben";

        System.out.println(senior);


    }
}
