package Week2_Algo;

import java.util.Scanner;

public class ParaUstu {

    public static void main(String[] args) {

        System.out.print("Bir fiyat giriniz: ");
        Scanner scan = new Scanner(System.in);

        double value = scan.nextDouble();
        int amount = (int) value;

        // Cozum  120

        int hundred = amount / 100;   // verilen para miktarini 100 e bolersem kac adet 100 luk var bulurum...  120 / 100 = 1

        int fifty = (amount % 100) / 50;

        int twenty = ((amount % 100) % 50) / 20;

        int ten = (((amount % 100) % 50) % 20) / 10;

        int five = ((((amount % 100) % 50) % 20) % 10) / 5;

        int one = (((((amount % 100) % 50) % 20) % 10) % 5);


        System.out.println(hundred + " adet yuz tl\n" +
                fifty + " adet elli tl\n" +
                twenty + " adet yirmi tl\n" +
                ten + " adet on tl\n" +
                five + " adet bes tl\n" +
                one + " adet bir tl\n" );
    }
}
