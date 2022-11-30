package _03_Week;

import java.util.Scanner;

public class _11_Soru {
    /*

        Klavyeden girilen tüm satırı okuyan Scanner komutu hangisidir?

        Cevap = "scannerDegiskeni.nextLine()".

     */

    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        String degisken = oku.nextLine();

        System.out.println(degisken);

        // nextInt() ---> Kullanıcıdan aldığımız değişkeni, bir integer tipindeki değişkene tanımlar.

        // nextByte() ---> Kullanıcıdan aldığımız değişkeni, bir byte tipinceki değişkene tanımlar.

        // next() ---> Kullanıcıdan aldığımız değişkeni, bir String tipinceki değişkene tanımlar.
        // tek kelime döndürür.

        // nextLine() ---> Kullınıcıdan aldığımız değişkeni, bir String tipinceki değişkene tanımlar.
        // tüm satırı döndürür.


    }
}
