package Tasks;

import java.util.Scanner;

public class MethodYedekSoru {
    public static void main(String[] args) {

        // Kullanıcıdan alınacak 10 tane sayının her biri için karşılaştırma yapıp, ilk girilen büyükse "önce girilen sayı büyük"
        // bir sonraki sayı büyükse "son girilen sayı büyük" eşitlik varsa "iki sayı eşit" şeklinde ekrana yazdıran bir metod oluşturunuz.

        islem();
    }
    public static void islem() {
        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int num1 = oku.nextInt();
        int num2;

        for (int i = 1; i < 10; i++) {

            System.out.print("bir sayı giriniz: ");
            num2 = oku.nextInt();

            if (num1 > num2) {
                System.out.println("önce girilen sayı büyük -> " + num1);
            } else if (num2 > num1) {
                System.out.println("son girilen sayı büyük -> " + num2);
            } else {
                System.out.println("iki sayı eşit");
            }
            System.out.println();
            num1 = num2;

        }
    }
}
