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

        // Traversal
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

//        for (int n : numbers3) {
//            System.out.println(n);
//        }

        // Sorting
        Arrays.sort(numbers3);
        System.out.println("sorted "+ Arrays.toString(numbers3));

        System.out.println("Arrays.equals(numbers, numbers2) = " + Arrays.equals(numbers, numbers2));

        // Binary Search
        System.out.println("Arrays.binarySearch(numbers, 10) = " + Arrays.binarySearch(numbers,20 ));

        //  1  2  3  4  5  6  7  8  9  10
        //                          ^


        // 9






    }
}