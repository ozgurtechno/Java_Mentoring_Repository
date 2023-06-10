package SoruCozumleri;

import java.util.Scanner;

public class TernaryOperatorOrnek {
    public static void main(String[] args) {

        // Örnek Soru :  Girilen bir sayının pozitif olup olmadığını, pozitifse çift sayı olup olmadığını yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı: ");

        int a = input.nextInt();

        // 1.yöntem
        System.out.println(a >= 0 ? (a % 2 == 0 ? "çift" : "tek") : "sayı negatif" ); // direk print ettiğimizde, dönüş data type farklılıkları sorun olmaz.

        // 2.yöntem
        boolean bln = a >= 0 ? (a % 2 == 0 ?  true : false) : false;  // değişkene atayarak yapınca, dönüş data type aynı olmalı
        System.out.println("sayı sıfırdan büyük ve çift mi :" + bln );

    }
}
