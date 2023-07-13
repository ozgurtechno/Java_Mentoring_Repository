import Inheritance.Aircraft;
import Inheritance.ArmoredVehicle;
import Inheritance.Helicopter;
import Inheritance.Tank;

public class Inheritance_Demo {

    public static void main(String[] args) {

        ArmoredVehicle tank = new Tank("AC-410", 1000, "Gasoline", true, "Dogu Cephesi", 4, 80);
        ArmoredVehicle ucak = new Aircraft("F-16",10000, "Jet Fuel", false, 4);
        ArmoredVehicle helikopter = new Helicopter("AC-110", 5000, "Jet Fuel", false, "Bomba1");

        ArmoredVehicle armored = new ArmoredVehicle("sdvasd",12000, "twet",false);
        armored.attack();
//        System.out.println(armored);
//        System.out.println(helikopter);

        Helicopter helicopter2 = new Helicopter("AC-120", 7000, "Jet Fuel", false, "Bomba2");
        helicopter2.fly();

        Tank tank2 = new Tank("AC-500", 1200, "Gasoline", true, "Bati Cephesi", 4, 70);
        tank2.transformToFloat();

        Aircraft ucak2 = new Aircraft("F-15",15000, "Jet Fuel", false, 6);
        ucak2.fly();
        ucak2.attack();
    }
}