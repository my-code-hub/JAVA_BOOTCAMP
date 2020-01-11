package lv.rcs.lesson17.solutions.vehicle;

//Create a class "Bicycle" which is a subclass of "Vehicle":
//    Add a private property "seatHeight" and public getter and setter for it.
//    Add a constructor with 3 parameters (brand, speed and seatHeight):
//        In this constructor first call the constructor of parent class (to initialize brand and speed).
//        And then initialize seatHeight.
//    Override method "move" so it outputs text: "moderately riding bicycle at [speed] km/h"
public class Bicycle extends Vehicle {

    private int seatHeight;

    public Bicycle(String brand, int speed, int seatHeight) {
        super(brand, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void move() {
        System.out.println("moderately riding bicycle at " + speed + " km/h");
    }
}
