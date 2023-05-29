public class Casting {

    public static void main(String[] args) {

        // Data Casting = convert data types
        // Java can make some conversion, for some Java needs our help

        int d1 = (int) 4.5;


       // 00000000 00000000 00000000 00000100

        //int number = 10.0;
        int number2 = (int) 10.0;
        System.out.println(number2);

        // TODO Question-1
        // create int type variable
        int num = 10;
        System.out.println("The integer value: " + num);

        // convert into double type
        double data = num;
        System.out.println("The double value: " + data);


        // TODO Question-2
        // create double type variable
        double num1 = 10.99;
        System.out.println("The double value: " + num1);

        // convert into short type
        short data1 = (short) num1;
        System.out.println("The integer value: " + data1);

    }
}
