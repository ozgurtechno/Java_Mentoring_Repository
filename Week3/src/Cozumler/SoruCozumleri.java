package Cozumler;

public class SoruCozumleri {

    public static void main(String[] args) {

        System.out.println("------------------------------ Ornek 1 --------------------------------------");
        // Ornek 1 - Verilen bir String ifadeyi tersten yazdiran bir program yaziniz

        String word = "Merhaba Dunya";

        for (int i = word.length() - 1; i >= 0; i--) {

            System.out.print(word.charAt(i));

        }
        System.out.println();

        System.out.println("------------------------------ Ornek 2 --------------------------------------");
        // Ornek 2 - Verilen bir String ifadenin Palindrome olup olmadigini test eden bir program yaziniz

        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

        System.out.println("------------------------------ Ornek 3 --------------------------------------");
        // Ornek - 3 - Verilen bir sayinin Faktoryelini hesaplayan bir program yaziniz

        int n = 6;
        int factorial = 1;
        int i = 1;

        while(i <= n) {
            factorial = factorial*i;
            i++;
        }

        System.out.println("Factorial of "+n+" is : "+factorial);

    }
}
