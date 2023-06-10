package Tasks;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        // Ask User to enter 5 positive number between 0-100
        // If user enter a number bigger than 100 than warn user to enter a different number...
        // You should be calculating 5 positive number sum at the end, not 4 or 3 because of user mistakes


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
