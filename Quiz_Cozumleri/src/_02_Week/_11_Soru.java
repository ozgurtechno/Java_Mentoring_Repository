package _02_Week;

public class _11_Soru {

    /*

        Aşağıdaki program parçasının ekran çıktısı ne olur?

        int x = 2;
        System.out.println(++x - x++ - x-- + x++);

        Cevap = "-1"

     */

    public static void main(String[] args) {


        int x = 2;

        System.out.println(++x - x++ - x-- + x++); // 3 - 3 - 4 + 3 ----> -1


    }
}
