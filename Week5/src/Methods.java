public class Methods {
    public static void main(String[] args) {

        calculate(12, 4);
        System.out.println(calculator(12,4,"bol"));
        System.out.println(calculator(12,4,"topla"));
        System.out.println(calculator(12,4,"cikar"));
        System.out.println(calculator(12,4,"carp"));
        System.out.println(calculator(12,4,"carpg"));

    }
    public static void calculate(int a, int b){
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
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