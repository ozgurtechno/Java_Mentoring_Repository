package _02_Week;

public class _03_Soru {


    /*

        Aşağıdaki programın ekran çıktısı ne olur?

        int x = 1, y = 2, r=3; r *= x + y;

        System.out.print(r);


        Cevap = "9"

     */

    public static void main(String[] args) {

        int x = 1;

        int y = 2;

        int r = 3;

        r *= x + y; // 3 *= 2 + 1 ---> 3 *= 3 ---> 9

        System.out.print(r);

    }
}
