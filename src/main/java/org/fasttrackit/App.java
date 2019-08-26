package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Car car = new Car();
        car.name = "Ferrari";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 2;
        car.maxSpeed = 280;
        car.fuelType = "Gasoline";

        Engine engine = new Engine ();
        engine.manufacturer = "Ferrari";
        engine.capacity = 5000;
        car.engine = engine;
        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        Car car2 = new Car();
        car2.name = "Bugatty";
        car2.fuelLevel = 100;
        car2.mileage = 10.58;
        car2.doorCount = 3;
        car2.maxSpeed = 300;
        car2.fuelType = "Kerosen";

        Engine engine2 = new Engine ();
        engine.manufacturer = "Bugatty";
        engine.capacity = 5000;
        car2.engine = engine2;

        System.out.println("Car2 name: " + car2.name); // concatenation
        System.out.println("Car1 name: " + car.name); // concatenation

        car = car2;

    }
}
