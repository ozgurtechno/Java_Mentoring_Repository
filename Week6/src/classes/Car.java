package classes;

public class Car {

    public String model;
    public int year;

    public void start(){
        System.out.println("Car started...");
    }

    // SINGLE RESPONSIBILITY
    public void printCar(){
        // Bu kodun bu class ta yeri yok... Her class sadece tek bir amacla var olmalidir...
        // Bu Class Car ile birebir alakali field ve mothodlari icermelidir...
    }
}
