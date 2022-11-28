public class Loops {

    public static void main(String[] args) {

        //For Loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Merhaba Dunya");
        }



        // While Loop
        int i = 0;
        while (i < 10){
            System.out.println("While dongusu cagrildi...");
            i++;
        }



        // Do-While Loop - Neden 10 defa cagrilmadi?
        int y = 0;
        do{
            System.out.println("Do-While dongusu cagrildi");
        } while (y > 10);




        // Nested For Loops
        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= 4 ; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
