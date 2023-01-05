package Quiz7;

public class Q6 {
    //Aynı isimden birden çok method olabilir.
    public static void main(String[] args) {
        test();
        test("Parametreli method");
    }

    public static void test()
    {
        System.out.println("Parametresiz method");
    }

    public static void test(String text)
    {
        System.out.println(text);
    }

}
