package _02_Week;

public class _21_Soru {
    // < > "

    /*

        Doğru cevapları eşleştiriniz.


     */

    public static void main(String[] args) {


        String string1 = "Merhaba Bugün Hava Çok Güzel";

        String string2 = " , Dışarıya çıkmaya ne dersin?     ";

        System.out.println(string1.indexOf("h")); // ----> 3

        System.out.println(string1.startsWith("Mer")); // ----> "true"

        System.out.println(string1.toUpperCase()); // ----> "MERHABA BUGÜN HAVA ÇOK GÜZEL"

        System.out.println(string1.substring(0,7)); // ----> "Merhaba"

        System.out.println(string1.toLowerCase()); // ----> "merhaba bugün hava çok güzel"

        System.out.println(string1.isEmpty()); // ----> "false"

        System.out.println(string1.concat(string2)); // ----> "Merhaba Bugün Hava Çok Güzel, Dışarıya çıkmaya ne dersin?"

        System.out.println(string1.charAt(0)); // ----> "M"

        System.out.println(string1.endsWith("Selam")); // ----> "false"

        System.out.println(string2.trim()); // " , Dışarıya çıkmaya ne dersin?     " ----> ", Dışarıya çıkmaya ne dersin?"





    }
}
