package lv.rcs.prebootcamp.lesson17.exercises.vehicle;

import lv.rcs.prebootcamp.lesson17.solutions.vehicle.Bicycle;
import lv.rcs.prebootcamp.lesson17.solutions.vehicle.Car;
import lv.rcs.prebootcamp.lesson17.solutions.vehicle.SportsCar;
import lv.rcs.prebootcamp.lesson17.solutions.vehicle.Vehicle;

// 17.1 Inheritance exercise:
public class VehicleMain {

    public static void main(String[] args) {
        //Create object of type Vehicle with brand "none" and speed 5
        Vehicle vehicle = new Vehicle("none", 5);
        //output the brand of this object
        System.out.println(vehicle.getBrand());
        //call method move and description on this instance
        vehicle.description();

        //Create object of type Car with brand "BMW" and speed 90 and horsepower 200
        Car car = new Car("BMW", 90, 400);
        //output the brand of this object
        System.out.println(car.getBrand());
        //call method description on this instance
        car.description();
        //output fuel for this car
        System.out.println(car.getFuel());
        //add 50 fuel to this car
        car.addFuel(50);
        //output fuel for this car
        System.out.println(car.getFuel());
        //call method move
        car.move();
        //call method "power" on this car
        car.power();
        car.checkFuel();


        //Create object of type SportsCar with brand "Porsche" and speed 200 and horsepower 400
        SportsCar sportsCar = new SportsCar("Porsche", 200, 400, 200);
        //output the brand of this object
        System.out.println(sportsCar.getBrand());
        //call method description on this instance
        sportsCar.description();
        //output fuel for this car
        sportsCar.getFuel();
        //add 50 fuel to this car
        sportsCar.addFuel(50);
        //output fuel for this car
        System.out.println(sportsCar.getFuel());
        //call method move
        sportsCar.move();
        //call method "power" on this car
        sportsCar.power();
        sportsCar.checkFuel();


        //Create object of type Bicycle with brand "Merida" and speed 30
        //and seat height 5
        Bicycle bicycle = new Bicycle("Merida", 30, 50);

        //output seat height
        System.out.println(bicycle.getSeatHeight());
        //change seat height to 10
        bicycle.setSeatHeight(10);
        //output seat height
        System.out.println(bicycle.getSeatHeight());
        //call method move
        bicycle.move();
        //call method description
        bicycle.description();
    }
}
