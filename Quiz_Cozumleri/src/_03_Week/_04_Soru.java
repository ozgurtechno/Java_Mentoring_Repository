package _03_Week;

public class _04_Soru {
    /*

        Math.random() komutu hangi aralıkta sayı üretir?

        Math.random fonksiyonu 0 ile 1 arasinda ondakilkli bir sayi üretir.
        örn: 0.34234234, 0.42342365, 0.7954656, 0.012301294


        Cevap = "0 ile 1 arasında sayı üretir"

     */

    public static void main(String[] args) {


        int x = (int) Math.random();
        double y = Math.random();

        System.out.print(x);
        System.out.print(y);


    }
}
