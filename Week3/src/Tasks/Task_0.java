package Tasks;

import java.util.Scanner;

public class Task_0 {

    public static void main(String[] args) {

        System.out.println("------------------------------ Exmp 1 --------------------------------------");

        // Find the largest element in Array
        int [] arr = {11, 22, 33, 99, 88, 77};

        int largestElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > largestElement)
                largestElement = arr[i];
        }
        System.out.println("Largets: " + largestElement);

        System.out.println("------------------------------ Exmp 2 --------------------------------------");

        // Print the repeated elements in Array
        int[] numbers2 =  {2, 4, 6, 8, 4, 6, 10, 10};
        System.out.println("Duplicate elements in given array are: ");

        for(int i = 0; i < numbers2.length; i++) {
            for(int j = i + 1; j < numbers2.length; j++) {
                if(numbers2[i] == numbers2[j]) {

                    System.out.println(numbers2[j]);
                }
            }
        }

    }
}
