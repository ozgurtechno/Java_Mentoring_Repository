package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Class_Demo {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Honda";
        car1.year = 2020;

        Car car2 = new Car();
        car2.model = "BMW";
        car2.year = 2008;

        Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        ArrayList<Car> cars2 = new ArrayList<>(Arrays.asList(car1, car2));
        cars2.add(new Car());

        // Nasil dongu yapariz...

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].model);
            System.out.println(cars[i].year);
            cars[i].start();
        }

        for (Car car : cars2) {
            System.out.println(car.model);
            System.out.println(car.year);
            car.start();
        }




    }
}
