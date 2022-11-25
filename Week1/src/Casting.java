public class Casting {

    public static void main(String[] args) {

        // Data Casting = data tiplerinin birbirine donusturulmesidir...
        // Java bazi donusumleri otomatik yapar, bazilarini bizim dikte ettirmemiz gerekir...

        int d1 = (int) 4.5; // 4 aslinda bir integer, biz burada otomatik bir Casting goruyoruz...


       // 00000000 00000000 00000000 00000100

        //int number = 10.0;
        int number2 = (int) 10.0;
        System.out.println(number2);

        String a = "Alper";    // obj1
        String b = "Alperen";  // obj2
        b = b.substring(0,5);  // Alper
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b)); //
    }
}
