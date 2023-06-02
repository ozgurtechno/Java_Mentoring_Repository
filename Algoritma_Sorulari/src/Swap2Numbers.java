public class Swap2Numbers {

    public static void main(String[] args) {

        int x = 6;
        int y = 12;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("X is ...: " + x);
        System.out.println("Y is ...: " + y);

        // You should not declare another variable
        int a = 6;
        int b = 12;

        a = a - b;  // 6 - 12 = -6
        b = a + b;  // -6 + 12 = 6
        a = b - a;  // 6 - -6  = 12

        System.out.println("A is ...: " + a);
        System.out.println("B is ...: " + b);

    }
}
