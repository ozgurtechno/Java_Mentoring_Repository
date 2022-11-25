package SoruCozumleri;

import java.util.Scanner;

public class If_Else_EmailValidator {

    // Girilen bir email in uygun formatta olup olmadığını belirten bir program yaziniz

    /*

    Girilen email için uygunluk koşullari:

    1- Email ".com" ile bitmeli
    2- Email "@" işareti bulundurmalı
    3- "@" işareti ".com" dan önce olmalı
    4- "@" ile ".com" arasinda en az 1 karakter olmalı
    5- "@" işareti öncesinde en az 1 karakter olmalı

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen email adresinizi giriniz : ");
        String email = input.next();

        if (
                email.contains("@")
                        &&
                        email.contains(".com")
                        &&
                        email.indexOf("@") < email.indexOf(".com")
                        &&
                        !email.substring(0,email.indexOf("@")).isEmpty()
                        &&
                        !email.substring(email.indexOf("@") + 1,email.length() - 4).isEmpty()
        ) {

            System.out.println("Geçerli Email Adresi...");

        }else {
            System.out.println("Geçersiz Email Adresi...");
        }


    }

}
