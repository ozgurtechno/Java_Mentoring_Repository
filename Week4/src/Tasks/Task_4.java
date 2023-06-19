package Tasks;

public class Task_4 {
    // Write a Java program to reverse an array.
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};

        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        System.out.println("\nReversed array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}

