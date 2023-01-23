package Static_Demo;

public class Static_Test {

    public static void main(String[] args) {

        Bicycle b1 = new Bicycle("mountion", 2);
        b1.gear = 4;
        b1.type = "city";
        b1.changeGear();
//        b1.bicycleCount;

        Bicycle b2 = new Bicycle("city", 4);
        b2.gear = 5;
        b2.type = "city";
        b2.changeGear();

        System.out.println(Bicycle.bicycleCount);


//        Math math = new Math();  Math Class is a helper class for us to make some mathematical calculations
        double x = Math.acos(7);
        double pi = Math.PI;
        System.out.println(x);

        UtilityClass utility = new UtilityClass();
        int c = UtilityClass.convertToInteger("1234");
        System.out.println("c = " + c);








    }
}
