package Tasks;

public class Task_1_1 {

    public static void main(String[] args) {

        // Swap these 2 numbers
        int x = 6;
        int y = 12;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("X is ...: " + x);  // x = 12
        System.out.println("Y is ...: " + y);  // y = 6

        // Swap without declaring third variable
        int a = 6;
        int b = 12;

        // % 99 percent of your job will be copying and pasting


        System.out.println("A is ...: " + a);
        System.out.println("B is ...: " + b);

    }
}














/*

        int temp = x;
        x = y;
        y = temp;

        a = a - b;  // 6 - 12 = -6
        b = a + b;  // -6 + 12 = 6
        a = b - a;  // 6 - -6  = 12
 */