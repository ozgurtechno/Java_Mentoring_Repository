package SoruCozumleri;

import java.util.Arrays;
import java.util.Scanner;

public class MethodCozumler {

    public static void main(String[] args) {

        System.out.println("------------------------------ Ornek 1 --------------------------------------");

        // Method Soru 1 - TODO Bir String de tum sesli harfleri sayan bir method yaziniz....
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println(count_Vowels(str));


        System.out.println("------------------------------ Ornek 2 --------------------------------------");

        // Method Soru 2 - TODO Verilen 2 karakter arasinda kalan karakterleri yazdiran bir method yaziniz....
        print_Chars('(', 'z');


        System.out.println("------------------------------ Ornek 3 --------------------------------------");

        // Method Soru 3 : TODO Verilen bir dizide her elemanin kac defa tekrar ettigini veren bir method yaziniz..
        var numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
                               // int[] resultArray = new int{ 2 ,-1, 2, 2, 3, -1,-1,-1, -1 }
        var nnnnn = findFrequency(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(findFrequency(numbers)));
        //Her elemanin kac defa tekrar ettigini yazdiralim
        for(int i = 0; i < findFrequency(numbers).length; i++){

            if(findFrequency(numbers)[i] != -1)

                System.out.println("Element: "+numbers[i] + " Frequency: " + findFrequency(numbers)[i]);
        }

    }

    // 1 , 2, 1, 3, 5 , 1
    // i
    //        j

    private static int[] findFrequency(int[] numbers) {

        int[] resultArray = new int [numbers.length]; // Dondurecegimiz sonuc array i

        var sayildi = -1; // Sayilan elemanlara bunu atiyacam

        for(int i = 0; i < numbers.length; i++){

            int count = 1;  //

            for(int j = i+1; j < numbers.length; j++){

                if(numbers[i] == numbers[j]){

                    count++;
                    //Ayni elemani bir daha saymamak icin ona -1 atiyoruz...
                    resultArray[j] = sayildi;
                }
            }
            if(resultArray[i] != sayildi)
                resultArray[i] = count;
        }
        return resultArray;
    }


    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void print_Chars(char char1, char char2) {

        for (char i = char1 ; i <= char2; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
