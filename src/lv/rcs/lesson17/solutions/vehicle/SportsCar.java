package lv.rcs.lesson17.solutions.vehicle;

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
