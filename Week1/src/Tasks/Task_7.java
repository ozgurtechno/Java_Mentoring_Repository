package Tasks;

public class Task_7 {

    public static void main(String[] args) {

        int x = 1, y = 2, z = 5;

        if(x == 1 || x > y || x > z) {
            System.out.println("One");
        }

        if(x == y || y == 2 || z == 5) {
            System.out.println("Two");
        }

        if(x == y || y == z || z == x) {
            System.out.println("Three");
        }

    // What is the outcome of this code?
    }
}
