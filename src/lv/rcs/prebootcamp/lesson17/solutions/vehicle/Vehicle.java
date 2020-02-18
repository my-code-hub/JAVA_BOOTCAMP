package lv.rcs.prebootcamp.lesson17.solutions.vehicle;

//    Create a class "Vehicle":
//        Add a private property "brand" (text) and a public getter method for it
//        Add a property "speed" (with protected access modifier)
//        Also add a constructor with two parameters for initializing both properties (brand and speed)
//        Implement a public method "move" which outputs text: "moving with speed [speed] km/h"
//        Implement a method "description" which outputs message:
//            "This vehicle's brand is [brand] and speed [speed] km/h"
public class Vehicle {

    private String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void move() {
        System.out.println("moving with speed " + speed + "km/h");
    }

    public void description() {
        System.out.println("This vehicle's brand is " + brand + " and it can move "
                + speed + " km/h");
    }
}
