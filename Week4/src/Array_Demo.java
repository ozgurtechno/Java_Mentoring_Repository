import java.util.Arrays;

public class Array_Demo {

    public static void main(String[] args) {

        // Sabit sayili
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        int numbers2[] = new int[10];
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = { 20, 10 , 40 };
        System.out.println(Arrays.toString(numbers3));

        // Her elemana ulasma
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        for (int n : numbers3) {
            System.out.println(n);
        }

        // Siralandirma
        Arrays.sort(numbers3);
        System.out.println("sorted "+ Arrays.toString(numbers3));

        // Binary Search
        System.out.println("Arrays.binarySearch(numbers, 10) = " + Arrays.binarySearch(numbers,20 ));

        // 2 boyutlu Array

        int[][] numberList = new int[3][4];     // { 10, 20, 30, 0 }
        numberList[0][0] = 10;                  // { 40, 50, 60, 0 }
        numberList[0][1] = 20;                  // { 0,  0,  0,  0 }
        numberList[0][2] = 30;                  //
        numberList[1][0] = 40;
        numberList[1][1] = 50;
        numberList[1][2] = 60;
        System.out.println(Arrays.deepToString(numberList));

        int[][] numberList2 = { { 10,20,30 },
                                { 40,50,60 }
                              };

        System.out.println("numberList2[0] = " + Arrays.toString(numberList2[0]));


    }
}