package lv.rcs.lesson17.examples.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/inheritance-in-java/
        // inheriting properties and methods (public, protected and package (only if in the same package))

        Sport sport1 = new Sport("Ice Hockey");
        //sport1.setName("ice hockey");
        System.out.println(sport1.getName());
        sport1.description();

        Running running = new Running("Running");
//        running.setName("Running");
        running.setDistance(10);
        running.description();





        // constructor hierarchy

        //discuss Object and how it's a superclass of all objects (talk about toString())
        //any object actually inherits methods from Object

        //abstract class / method example

        // talk about "this" and "super"

        //interface

        //is-a relationship (instanceof)

        //final keyword

    }
}
