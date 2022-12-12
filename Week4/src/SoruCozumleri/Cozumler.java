package SoruCozumleri;

import java.util.Scanner;

public class Cozumler {

    public static void main(String[] args) {

        System.out.println("------------------------------ Ornek 1 --------------------------------------");

        // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};

        int largestElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > largestElement)
                largestElement = arr[i];
        }
        System.out.println("En buyuk eleman: " + largestElement);

        System.out.println("------------------------------ Ornek 2 --------------------------------------");

        // Ornek 2 : Verilen bir Array de tekrar eden elemanlari yazdirin...
        int [] numbers2 = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        System.out.println("Duplicate elements in given array are: ");
        //Tum elemanlari birbirleri ile karsilastiralim...
        for(int i = 0; i < numbers2.length; i++) {
            for(int j = i + 1; j < numbers2.length; j++) {
                if(numbers2[i] == numbers2[j]) {
                    //Tekrar eden elemanlari yazdiralim
                    System.out.println(numbers2[j]);
                }
            }
        }

        System.out.println("------------------------------ Ornek 4 --------------------------------------");

        // Ornek 4 : Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        String str = new String(ch);
        System.out.println(str);

        // Method 2: valueOf methodu ile
        String str2 = String.valueOf(ch);
        System.out.println(str2);

        System.out.println("------------------------------ Ornek 5 --------------------------------------");

        // Ornek 5 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
        // Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...

        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            number = input.nextDouble();

            // girilen sayi negatif ise basa donmeli
            if (number <= 0.0) {
                continue;
            }

            // girilen deger 100 den buyukse program sonlandirilmali...
            if (number > 100){
                System.out.println("Hatali giris yaptiniz...");
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
