package SoruCozumleri;

public class CarpimTablosu {

    public static void main(String[] args) {

        // Carpim Tablosunun 1, 2 ve 3 ler hanesinin tum sonuclarini ekrana yazdiran bir program yaziniz...

        // En distaki for loop.
        sihirliRakam(49);

    }

    public static void sihirliRakam(int sihirliRakam){

        outer:
        for(int i = 1; i <= 10; i++) {

            // Icteki for loop.
            inner:
            for(int j = 1; j <= 10; j++){
                if (i * j == sihirliRakam) break outer;
                System.out.print(i+ " x " +j+" = "+ (i*j));
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
