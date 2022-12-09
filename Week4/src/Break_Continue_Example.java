import java.util.Scanner;

public class Break_Continue_Example {

    public static void main(String[] args) {

        // Carpim Tablosunun 1, 2 ve 3 ler hanesinin tum sonuclarini ekrana yazdiran bir program yaziniz...

        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // i x j = i * j

        for (int i = 1; i <= 3; i++) {
            // i=1
            for (int j = 1; j <= 9 ; j++) {
                // 1
                // 2
                // 3
            }

        }


        // Ornek 5 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
        // Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...


        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("0-100 arasi bir sayi giriniz?");
            int a = scan.nextInt();
            if (a > 100) {
                System.out.println("Tekrar deneyin");
                i--;
            } else{
                toplam += a;
            }

        }
        System.out.println(toplam);



    }
}
