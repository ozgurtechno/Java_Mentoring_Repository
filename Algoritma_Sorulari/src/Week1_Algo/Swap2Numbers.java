package Week1_Algo;

public class Swap2Numbers {

    public static void main(String[] args) {

        int x = 6;
        int y = 12;

        // Ogrenciler bu kismi yazacak
        int temp = x;
        x = y;
        y = temp;

        // Bu kisim hazir verilecek
        System.out.println("X in yeni degeri...: " + x);
        System.out.println("Y nin yeni degeri..: " + y);

        // Cozum 2 : Yeni bir degisken tanimlanmadan....
        int a = 6;
        int b = 12;

        a = a - b;  // 6 - 12 = -6
        b = a + b;  // -6 + 12 = 6
        a = b - a;  // 6 - -6  = 12

        System.out.println("A in yeni degeri...: " + a);
        System.out.println("B nin yeni degeri..: " + b);

    }
}
