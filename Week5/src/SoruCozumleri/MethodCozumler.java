package SoruCozumleri;

import java.util.Scanner;

public class MethodCozumler {

    public static void main(String[] args) {

        // Method Soru 1 - Bir String de tum sesli harfleri sayan bir method yaziniz....
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println(count_Vowels(str));

        // Method Soru 2 - Verilen 2 karakter arasinda kalan karakterleri yazdiran bir method yaziniz....
        print_Chars('(', 'z', 20);


    }

    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

    public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
        System.out.print("\n");
    }
}
