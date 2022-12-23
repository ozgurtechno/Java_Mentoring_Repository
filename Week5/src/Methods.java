import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {  // DRY - Dont Repeat Yourself

        int[] x = arrayUret(12, 4);

        System.out.println(Arrays.toString(x));

        System.out.println("calculator(12,4,'+') = " + calculator(12, 4, '+'));

        // CRUD - Create / Read / Update / Delete
        int birinci = 12;
        int ikinci = 23;

        int ucuncu = 43;
        int dordunce = 33;
        topla(ucuncu, dordunce);

        System.out.println(calculator(12,4,'+')+" toplama");
        System.out.println(calculator(12,4,'-'));
        System.out.println(calculator(12,4,'*'));
        System.out.println(calculator('/',12, 4, 2 ));


        // TODO Method Soru 1 - Bir String de tum sesli harfleri sayan bir method yaziniz....
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        //String str = in.nextLine();

        // TODO Method Soru 2 - Verilen 2 karakter arasinda kalan karakterleri yazdiran bir method yaziniz....
        // print_Chars('(', 'z', 20);


        // TODO Method Soru 3 : Verilen bir dizide her elemanin kac defa tekrar ettigini veren bir method yaziniz..
        int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

    } //-------------------- MAIN method bitti ------------------------------

    public static void topla(int number1, int number2){
        System.out.println(number1 + number2);

    }

    public static int[] arrayUret(int a, int b){
        int[] renamed = new int[2];
        renamed[0] = a;
        renamed[1] = b;
        return renamed;
    }

    public static int calculator(int a, int b, char islem){  // + -

        switch (islem){
            case 43 : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            case '/' : return a / b;
            default : System.out.println("Yanlis giris yaptiniz...");
        }
        return -1;
    }

    public static double calculator(char islem, int... numbers){  // + -

        switch (islem){
        }
        return -1;
    }


}