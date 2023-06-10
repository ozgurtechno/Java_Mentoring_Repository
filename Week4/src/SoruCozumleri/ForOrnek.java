package SoruCozumleri;

import java.util.Scanner;

public class ForOrnek {
    public static void main(String[] args) {

        // Örnek Soru: Kullanıcıdan bir ülke adı alarak aşağıdaki gibi yazdırınız.

        // e
        // ye
        // iye
        // kiye
        // rkiye
        // ürkiye
        // Türkiye

        Scanner input = new Scanner(System.in);
        System.out.print("ülke adı: ");
        String str1= input.nextLine();
        String str2 = "";

        for (int i = str1.length(); i >=0 ; i--) {
            str2= str1.substring(i);
            System.out.println(str2);
        }




    }
}
