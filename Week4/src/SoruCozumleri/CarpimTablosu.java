package SoruCozumleri;

public class CarpimTablosu {

    public static void main(String[] args) {

        // Carpim Tablosunun 1, 2 ve 3 ler hanesinin tum sonuclarini ekrana yazdiran bir program yaziniz...

        // En distaki for loop.
        for(int i = 1; i <= 10; i++)
        {
//            if (i == 4) break;
            // Icteki for loop.
            for(int j = 1; j <= 10; j++){
//                if (i * j % 2 == 0) continue;
                System.out.println(i+ " x " +j+" = "+ (i*j));
            }
            System.out.println(" ");
        }

    }
}
