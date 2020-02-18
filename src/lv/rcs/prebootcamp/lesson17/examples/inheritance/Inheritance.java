package lv.rcs.prebootcamp.lesson17.examples.inheritance;

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


        //more examples about super




        //toString()

        //abstract class / method example

        //interface

        //is-a relationship (instanceof)

        //final keyword

    }
}
