package Tasks;

public class Task_3 {
    // Write a Java program to check if an array contains a specific element.
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        int target = 8;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The array contains the element " + target);
        } else {
            System.out.println("The array does not contain the element " + target);
        }
    }
}

