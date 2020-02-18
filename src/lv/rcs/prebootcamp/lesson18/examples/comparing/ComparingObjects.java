package lv.rcs.prebootcamp.lesson18.examples.comparing;

public class ComparingObjects {

    public static void main(String[] args) {
        //- comparing objects and strings // checking for null
        Car car = new Car("BMW", 2015, "red", "1278366128356");
        Car car2 = new Car("BMW", 2015, "red", "1278366128357");

        // not equal, because references are different (point to different objects)
        if (car == car2) {
            System.out.println("Both cars are equal!");
        } else {
            System.out.println("Cars are not equal!");
        }

        // are equal, because references point to the same object
        Car car3 = car;
        if (car == car3) {
            System.out.println("Both cars are equal!");
        } else {
            System.out.println("Cars are not equal!");
        }

        //are equal, if method equals returns true
        if (car.equals(car2)) {
            System.out.println("Both cars are equal!");
        } else {
            System.out.println("Cars are not equal!");
        }
    }
}
