package _03_Week;

public class _20_Soru {
    /*
        Aşağıdaki kod parçasının çıktısı ne olur?


        int i = 33;

        if (i > 30)
            System.out.println("Greater than 30");
        else
            System.out.println("Less than 30");
        System.out.println("Done");



        Cevap = "Greter than 30, Done".

     */

    public static void main(String[] args) {


        int i = 33;

        // 33 > 30, blok çalışır

        if (i > 30)
            System.out.println("Greater than 30");
        else
            System.out.println("Less than 30");


        System.out.println("Done"); // bu satir else bloğunun dışarısında olduğu için çalışacaktır.


    }
}
