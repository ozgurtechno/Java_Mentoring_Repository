public class Casting {

    public static void main(String[] args) {

        // Data Casting = data tiplerinin birbirine donusturulmesidir...
        // Java bazi donusumleri otomatik yapar, bazilarini bizim dikte ettirmemiz gerekir...

        double d = 10; // 10 aslinda bir integer, biz burada otomatik bir Casting goruyoruz...


        //int number = 10.0;
        int number2 = (int) 10.0;
        System.out.println(number2);

    }
}
