package Week2_Algo;

import java.util.Scanner;

public class ParaUstu {

    public static void main(String[] args) {

        System.out.print("Enter amount of money: ");
        Scanner scan = new Scanner(System.in);

        double value = scan.nextDouble();
        int amount = (int) value;

        // Cozum

        int hundred = amount / 100;

        int fifty = (amount % 100) / 50;

        int twenty = ((amount % 100) % 50) / 20;

        int ten = (((amount % 100) % 50) % 20) / 10;

        int five = ((((amount % 100) % 50) % 20) % 10) / 5;

        int one = (((((amount % 100) % 50) % 20) % 10) % 5) / 1;


        System.out.println(hundred + " hundred dollar bills\n" +
                fifty + " adet elli tl\n" +
                twenty + " adet yirmi tl\n" +
                ten + " adet on tl\n" +
                five + " adet bes tl\n" +
                one + " adet bir tl\n" );
    }
}
