package Week3_Algo;

public class CarpimTablosu {

    public static void main(String[] args) {

        // Carpim Tablosunun 1, 2 ve 3 ler hanesinin tum sonuclarini ekrana yazdiranm bir program yaziniz...

        // Outer for loop.
        for(int i = 1; i <= 3; i++)
        {
            // Inner for loop.
            for(int j = 1; j <= 10; j++){
                System.out.println(i+ " * " +j+" = "+ (i*j));
            }
            System.out.println(" ");
        }

    }
}
