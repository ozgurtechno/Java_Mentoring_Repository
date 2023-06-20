package Tasks;

public class Task_6 {

    // Write a Java program to find the sum of elements in a 2D array.
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("The sum of elements in the 2D array is: " + sum);
    }
}

