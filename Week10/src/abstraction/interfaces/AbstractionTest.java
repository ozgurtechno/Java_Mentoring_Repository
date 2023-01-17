package abstraction.interfaces;

public class AbstractionTest {

    public static void main(String[] args) {

        Shape s1 = new Circle(4, "red");
        Shape s2 = new Rectangle(6,7,"Green");

        System.out.println(s1);
        System.out.println(s2);
    }



}
