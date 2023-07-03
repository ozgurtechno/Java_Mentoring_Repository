package classes;

import java.util.Objects;

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
    public void CalculateTax(){
        // Bu kodun bu class ta yeri yok... Her class sadece tek bir amacla var olmalidir...
        // Bu Class Car ile birebir alakali field ve mothodlari icermelidir...
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
