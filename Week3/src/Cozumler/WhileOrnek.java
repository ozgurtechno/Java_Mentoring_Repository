package Cozumler;

public class WhileOrnek {
    public static void main(String[] args) {

        // Örnek Soru: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz.


        int sayi = 0;

        int tek = 0;
        int cift = 0;

        while (sayi < 100){
            if(sayi % 2 == 1){
                tek +=sayi;
            }else{
                cift += sayi;
            }
            sayi++;
        }
        System.out.println("çift sayılar toplam: "+cift+"\ntek sayılar toplam: "+tek);
    }
}
