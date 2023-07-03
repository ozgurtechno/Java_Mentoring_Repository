package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Class_Demo {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Honda";
        car1.year = 2020;

        Car car2 = new Car("Honda", 2020);

        Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        Car car_ref1 =  new Car();
        Car car_ref2 =  new Car("Citroen", 2009);

        Car[] cars2 = {car_ref1 , car_ref2};

        ArrayList<Car> cars3 = new ArrayList<>(Arrays.asList(car1, car2));


        // Nasil dongu yapariz...

        for (int i = 0; i < cars3.size(); i++) {
            System.out.println(cars[i].model);
            System.out.println(cars[i].year);
            cars[i].start();
        }

        for (Car car : cars2) {
            System.out.println(car.model);
            System.out.println(car.year);
            car.start();
        }

        if (car1.model.equals(car2.model)) System.out.println("Modeller esit");
        if (car1.equals(car2)) System.out.println("Esittir");

        // TODO Class1 : Bir OKUL Class i olusturun,  bu okulda ogretmen, ogrenci, dersler vb objeler bulunsun...


    }
}
