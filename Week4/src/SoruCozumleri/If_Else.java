package SoruCozumleri;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        String userName = "TechnoStudy";
        String password = "12345";

        // ORNEK SORU : Yukarıdaki kayıtlı bilgilere göre kullanıcıdan, kullanıcı adı ve şifre alarak
        // 4 farklı opsiyon için login işlemlerini yazınız.

        // 1.opsiyon - kullanıcı adı ve şifre hatalı
        // 2.opsiyon - şifre hatalı
        // 3.opsiyon - kullanıcı adı hatalı
        // 4.opsiyon - sisteme giriş başarılı.

        Scanner input = new Scanner(System.in);
        System.out.print("kullanıcı adı: ");
        String kullaniciAdi = input.nextLine();

        System.out.print("şifre : ");
        String sifre = input.nextLine();

        if (!(userName.equals(kullaniciAdi)) && !(password.equals(sifre))){
            System.out.println("kullanıcı adı ve şifre hatalı!");

        } else if ((userName.equals(kullaniciAdi)) && !(password.equals(sifre))) {
            System.out.println("şifre hatalı!");

        } else if (!(userName.equals(kullaniciAdi)) && (password.equals(sifre))) {
            System.out.println("kullanıcı adı hatalı!");

        } else{
            System.out.println("sisteme giriş başarılı");
        }

        //******************************************************************

        // ORNEK SORU2 : Trafikte seyir halindeki kullanıcıdan trafik ışıklarından hangisinin yandığı bilgisini alıp
        // yönlendirme yapan programı yazınız.

        Scanner input2 = new Scanner(System.in);
        System.out.print("Yanan Trafik Lambası : ");
        String st = input.nextLine();

        if (st.equalsIgnoreCase("kırmızı")) {
            System.out.println("DUR!");
        }else if(st.equalsIgnoreCase("sarı")){
            System.out.println("Geçmeye Hazırlan!");
        }else if (st.equalsIgnoreCase("yeşil") ){
            System.out.println("GEÇ");
        }else {
            System.out.println("Hatalı Giriş Yaptınız!!");
        }
    }
}
