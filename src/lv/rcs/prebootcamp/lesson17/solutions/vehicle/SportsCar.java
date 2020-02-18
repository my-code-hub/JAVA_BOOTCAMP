package lv.rcs.prebootcamp.lesson17.solutions.vehicle;

//  Create a class "SportsCar" which is a subclass of "Car":
//        Add a private property "turbo" (whole number)
//        Override method "move" so it outputs text:
//            "racing sports car at [speed] km/h"
//         Add a constructor with parameters brand, speed, horsePower and turbo:
//            In this constructor first call the parent constructor and pass brand and speed as arguments to it.
//        Override method "power" which outputs "this car has a [horsePower + turbo] horse power"
public class SportsCar extends Car {

    private int turbo;

    public SportsCar(String brand, int speed, int horsePower, int turbo) {
        super(brand, speed, horsePower);
        this.turbo = turbo;
    }

    public void move() {
        System.out.println("driving at " + speed + "km/h");
    }

    public void description() {
        System.out.println("This is a " + getBrand() + " car which can drive at " + speed + "km/h." +
                " It has " + getFuel() + "l of fuel left in tank.");
    }

    public void power() {
        System.out.println("this car has " + getHorsePower() + turbo + " horse power");
    }
}
