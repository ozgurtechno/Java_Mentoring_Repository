package Quiz7;

public class Q5 {
    public static void main(String s[]) {
        int x = 6;
        int y = 3;
        int z = 12;
        int w = method1(x, y, z);

        System.out.println("w = " + w);
    }

    public static int method1(int x, int y, int z) {
        return (x * z) / y;
    }
}
