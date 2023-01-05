package Quiz7;

public class Q9 {
    public static int a() {
        return 65;
    }

    public static int b() {
        return a();
    }

    public static void main(String[] args) {
        System.out.print("" + b());
    }
}
