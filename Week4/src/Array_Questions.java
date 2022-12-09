import java.util.Arrays;

public class Array_Questions {


    public static void main(String[] args) {

        // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};

        // Arrays.sort(arr);
        int result = arr[arr.length - 1];

        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {

            max = Math.max(arr[i], max);
        }

        System.out.println(max);

        // Ornek 2 : Verilen bir Array de tekrar eden elemanlari yazdirin...
        int [] numbers2 = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        //                                                  ^

        // Big O Notation
        // Data Structures and Algorithms in Java
         Arrays.sort(numbers2); // -> Binary Search -> Logaritmik Time Complexity
        // Time Complexity // Space Complexity


        // Ornek 3 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..
        int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        // Ornek 4 : Verilen bir Character Array ini String e ceviren programi yaziniz...
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};

    }
}
