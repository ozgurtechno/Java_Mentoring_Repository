public class BreakContinue {
    public static void main(String[] args) {

        // Break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        // Ornek - 4 - Girilen bir sayinin Asal sayi olup olmadigini bulan bir program yaziniz...
    }
}
