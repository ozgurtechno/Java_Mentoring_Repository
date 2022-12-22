package classes;

public class Car {

    // ---------------------------------- INSTANCE FIELDS -------------------------------------------------------------
    public String model;
    public int year;

    // ---------------------------------- CONSTRUCTOR -------------------------------------------------------------

    public Car() {
    }

    public Car(String model, int year) {  // Constructor Overloading
        this.model = model;
        this.year = year;
    }

    // ---------------------------------- INSTANCE METHODS (BEHAVIOR) ----------------------------------------------

    public void start(){
        System.out.println("Car started...");
    }

    // SINGLE RESPONSIBILITY
    public void printCar(){
        // Bu kodun bu class ta yeri yok... Her class sadece tek bir amacla var olmalidir...
        // Bu Class Car ile birebir alakali field ve mothodlari icermelidir...
    }
}
