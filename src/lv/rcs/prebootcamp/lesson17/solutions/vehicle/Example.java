package lv.rcs.prebootcamp.lesson17.solutions.vehicle;

public class Example {

    public static void main(String[] args) {
        Car car = new Car("BMW", 200, 123);

        Vehicle vehicle = car;

        example(vehicle);

        //

        Vehicle car2 = new Vehicle("asd", 123);

        example(car);

    }

    public static void example(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println(car.getHorsePower());
            Vehicle vehicle2 = car;
        }
    }
}
