package Tasks;

public class Task_2 {

    // Write a Java program to calculate the average of elements in an array.
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;
        System.out.println("The average of elements in the array is: " + average);
    }
}

