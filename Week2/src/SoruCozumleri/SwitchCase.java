package SoruCozumleri;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        // Girilen bir sayinin haftanin hangi gunune denk geldigini yazdiran bir program yaziniz
        Scanner console = new Scanner(System.in);

        // Get the test score.
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = console.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("hatali bir sayi girdiniz");
        }
    }
}
