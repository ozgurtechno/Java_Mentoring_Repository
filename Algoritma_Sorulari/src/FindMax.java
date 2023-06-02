import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        // Girilen 10 sayidan en buyugunu ekrana yazdiralim....
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int result = 0;
        while (count <= 10){
            System.out.println("Lutfen bir sayi giriniz");
            int given = scan.nextInt();
            result = Math.max(result, given );
            count++;
        }
        System.out.println(result);

    }
}
