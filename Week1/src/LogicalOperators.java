public class LogicalOperators {

    public static void main(String[] args) {

        int x = 2;
        System.out.println(   x > 3    &&     x < 10    ); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(   x > 3    &    ++x < 10    ); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(   x > 3    &&   x++ < 10    ); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(x);

        int y = 5;
        System.out.println(   y > 3    ||    --y < 10   ); // returns true because 5 is greater than 3 OR 5 is less than 10
//        System.out.println(   y > 3   |     y < 10   ); // returns true because 5 is greater than 3 OR 5 is less than 10
//        System.out.println(y > 3 | y++ < 10); // returns true because 5 is greater than 3 OR 5 is less than 10
        System.out.println(y);




    }
}
