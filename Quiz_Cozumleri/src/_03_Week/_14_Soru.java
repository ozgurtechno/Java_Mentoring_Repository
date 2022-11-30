package _03_Week;

public class _14_Soru {
    /*

         Aşağıdaki program parçasının ekran çıktısı ne olur?

            int a = 5; int b = 9; int c = 0;
             if (a > b) {
            c = a;
            a = b;
            b = c;
            }
            System.out.println(b + "," + a);



            Cevap = "9,5".

     */

    public static void main(String[] args) {


        int a = 5; int b = 9; int c = 0;

        if (a > b) {
            c = a; // a = 5, b = 9, c = 5
            a = b; // a = 9, b = 9, c = 5
            b = c; // a = 9, b = 5, c = 5
        }

        // Yukarıdaki çalışma bloğu aksiyon almıyacaktir bu yüzden değerler değişmeyecektir.

        System.out.println(b + "," + a); // 9 , 5


    }
}
