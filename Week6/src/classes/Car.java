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

}
