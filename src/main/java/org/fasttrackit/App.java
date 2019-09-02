package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Engine engine2 = new Engine ();
        engine2.manufacturer = "Ferrari";
        engine2.capacity = 5000;
        Car car = new Car(engine2);
        car.name = "Ferrari";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 2;
        car.maxSpeed = 280;
        car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        car .accelerate(60, 1);

        Engine engine1 = new Engine ();
        engine1.manufacturer = "Bugatty";
        engine1.capacity = 5000;

        Car car2 = new Car(engine1);
        car2.name = "Bugatty";
        car2.fuelLevel = 100;
        car2.mileage = 10.58;
        car2.doorCount = 3;
        car2.maxSpeed = 300;
        car2.fuelType = "Kerosen";

        System.out.println("Car2 name: " + car2.name); // concatenation
        System.out.println("Car1 name: " + car.name); // concatenation

        car = car2;

    }
}
