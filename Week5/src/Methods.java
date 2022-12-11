import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        int[] x = arrayUret(12, 4);

        System.out.println(Arrays.toString(x));

//        System.out.println(calculator(12,4,"bol"));
//        System.out.println(calculator(12,4,"topla"));
//        System.out.println(calculator(12,4,"cikar"));
//        System.out.println(calculator(12,4,"carp"));
//        System.out.println(calculator(12,4,"carpg"));

    }
    public static int[] arrayUret(int a, int b){
        int[] result = new int[4];
        result[0] = a;
        result[1] = b;
        return result;
    }

    public static double calculator(int a, int b, String islem){

        switch (islem){
            case "topla" : return a + b;
            case "cikar" : return a - b;
            case "carp" : return a * b;
            case "bol" : return a / b;
            default : System.out.println("Yanlis giris yaptiniz...");
        }
        return 0;
    }
}