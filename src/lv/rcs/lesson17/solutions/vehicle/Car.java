package lv.rcs.lesson17.solutions.vehicle;

//    Create a class "Car" which is a subclass of "Vehicle":
//        Add a private property "fuel" (whole number) and public getter method for it
//        Add a private property "horsePower" and a public getter method
//        Add a constructor with parameters brand, speed and horsePower:
//            In this constructor first call the parent constructor and pass brand and speed as arguments to it.
//            Then initialize horsePower. And then initialize fuel to 50 (this will be default).
//        Override method "move" so it outputs text: "driving at [speed]km/h"
//        Override method "description" so it outputs text:
//                "This is a [brand] car which can drive at [speed] km/h. It has [fuel]l of fuel left in tank."
//        Add public method "addFuel" with parameter (whole number) which increments "fuel" value
//        Add public method "checkFuel" which outputs "[fuel] left in tank"
//        Add public method "power" outputs: "this car has [horsePower] horse power"
public class Car extends Vehicle {

    private int fuel;
    private int horsePower;

    public Car(String brand, int speed, int horsePower) {
        super(brand, speed);
        this.fuel = 50;
        this.horsePower = horsePower;
    }

    public int getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void move() {
        System.out.println("driving at " + speed + "km/h");
    }

    public void description() {
        System.out.println("This is a " + getBrand() + " car which can drive at " + speed + "km/h." +
                " It has " + fuel + "l of fuel left in tank.");
    }

    public void addFuel(int fuel) {
        this.fuel += fuel;
    }

    public void checkFuel() {
        System.out.println(fuel + " left in tank");
    }

    public void power() {
        System.out.println("this car has " + horsePower + " horse power");
    }
}
