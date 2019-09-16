package org.fasttrackit;

public class App
{
    public static void main(String[] args) {
        Game game = new Game ();
        game.start();
    }
//    public static void main( String[] args ) {
//
//        Engine engine2 = new Engine ();
//        engine2.manufacturer = "Ferrari";
//        engine2.capacity = 5000;
//        Car car = new Car(engine2);
//        car.setName("Ferrari");
//        car.setFuelLevel(60);
//        car.setMileage(8.5);
//        car.doorCount = 2;
//        car.setMaxSpeed(280);
//        car.setFuelType("Gasoline");
//        System.out.println("Car object: " + car.toString());
//
//
//        System.out.println(car.getName());
//        System.out.println(car.getTraveledDistance());
//        System.out.println(car.isRunning());
//
//        car .accelerate(60, 1);
//
//        Engine engine1 = new Engine ();
//        engine1.manufacturer = "Bugatty";
//        engine1.capacity = 5000;
//
//        Car car2 = new Car(engine1);
//        car2.setName("Bugatty");
//        car2.setFuelLevel(100);
//        car2.setMileage(10.58);
//        car2.doorCount = 3;
//        car2.setMaxSpeed(300);
//        car2.setFuelType("Kerosen");
//
//        System.out.println("Car2 name: " + car2.getName()); // concatenation
//        System.out.println("Car2 name: " + car2.getTraveledDistance()); // concatenation
//        System.out.println("Car2 name: " + car2.isRunning()); // concatenation
//
//        // car = car2;
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        System.out.println("Input from user: " + text);
//
//        System.out.println("Static variables example");
//        // we should only call static variables from the class itself (car),
//        // not from a variable containing an object of that class.
//        /*car.totalCount = 1;
//        System.out.println("Total count in car: " + car.totalCount);
//
//        car2.totalCount = 12;
//        System.out.println("Total count in car after setting car2: " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Car class: " + Car.totalCount);*/
//
//        // method implementation from object's class not from variable's class
//       Vehicle hybridCar = new HybridCar();
//       hybridCar.setName("Cheater");
//       hybridCar.accelerate(60, 1);
//       System.out.println("Fuel level: " + hybridCar.getFuelLevel());
//
//       // variable type decides what methods can be invoked
//        ((HybridCar) hybridCar).fly();
    }

