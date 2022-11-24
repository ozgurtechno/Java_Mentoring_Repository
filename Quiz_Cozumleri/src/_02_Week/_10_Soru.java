package _02_Week;

public class _10_Soru {

    /*

        Aşağıdaki program parçasının ekran çıktısı ne olur?

        byte x = 0;
        int y = x++;
        System.out.println(y);

        Cevap = "0"

     */

    public static void main(String[] args) {


        byte x = 0;

        int y = x++; // Buradaki x işlemden sonra 1 artacağı için, y 0 kalacaktır.

        System.out.println(y);


    }
}
