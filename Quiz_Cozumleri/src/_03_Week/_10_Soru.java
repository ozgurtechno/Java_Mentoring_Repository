package _03_Week;

import java.util.Scanner;

public class _10_Soru {
    /*

        Girilen sayının negatif mi pozitif mi yoksa 0 'mı oldugunu bulan bir program hangisidir?

        Cevap = "1. Şık".

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sayi = sc.nextInt();

        if (sayi < 0) {
            System.out.println(sayi + " Negatiftir.");
        } else if (sayi > 0) {
            System.out.println(sayi + " Pozitiftir.");
        } else
            System.out.println(sayi + " 0'dır.");

    }
}
