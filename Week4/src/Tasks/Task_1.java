package Tasks;

public class Task_1 {

    public static void main(String[] args) {

        // Write a Java program to find the second largest element in an array.
        int[] array = {5, 8, 2, 10, 3};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        System.out.println("The second largest element in the array is: " + secondMax);
    }
}

