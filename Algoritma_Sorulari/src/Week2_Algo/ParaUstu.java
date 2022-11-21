package Week2_Algo;

import java.util.Scanner;

public class ParaUstu {

    public static void main(String[] args) {

        System.out.print("Enter amount of money: ");
        Scanner scan = new Scanner(System.in);

        double value = scan.nextDouble();
        int valueIntegral = (int) value;

        // Cozum

        int hundred = valueIntegral / 100;

        int fifty = (valueIntegral % 100) / 50;

        int twenty = ((valueIntegral % 100) % 50) / 20;

        int ten = (((valueIntegral % 100) % 50) % 20) / 10;

        int five = ((((valueIntegral % 100) % 50) % 20) % 10) / 5;

        int one = (((((valueIntegral % 100) % 50) % 20) % 10) % 5) / 1;


        System.out.println(hundred + " hundred dollar bills\n" +
                fifty + " adet elli tl\n" +
                twenty + " adet yirmi tl\n" +
                ten + " adet on tl\n" +
                five + " adet bes tl\n" +
                one + " adet bir tl\n" );
    }
}
