import java.util.Scanner;

public class DoWhileOrnek {
    public static void main(String[] args) {

        // Örnek Soru: Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
        // Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.

        Scanner input = new Scanner(System.in);

        int kayitliPIN = 123;
        int hak = 1;

        do {
            System.out.print("PIN Kodunuzu Girin: ");
            int pin = input.nextInt();
            if (pin == kayitliPIN){
                System.out.println("Giriş Başarılı"); break;
            }else if (pin != kayitliPIN && hak !=3){
                System.out.println("Hatalı PIN Tekrar Deneyin");
            }else {
                System.out.println("Kartınız Bloke Oldu!");
            }
            hak++;

        }while (hak <= 3);
    }
}
