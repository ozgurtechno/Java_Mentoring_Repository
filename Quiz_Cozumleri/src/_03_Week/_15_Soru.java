package _03_Week;

public class _15_Soru {
    /*

         Aşağıdaki program parçasının ekran çıktısı nedir?

            int sonuc = 75;
              if (sonuc >= 70)
                 System.out.print("B");
              if (sonuc >= 60)
                 System.out.print("C");
              else System.out.println("D");



            Cevap = "BC".

     */

    public static void main(String[] args) {


        int sonuc = 75;

        if (sonuc >= 70) // bu blok çalışacaktir, 75 >= 70
            System.out.print("B");


        if (sonuc >= 60) // bu blok çalışacaktir, 75 >= 60
            System.out.print("C");

        else System.out.println("D"); // Else bloğu çalışmayacaktir çünkü bir üzerindeki, if bloğu çalıştı
    }
}
