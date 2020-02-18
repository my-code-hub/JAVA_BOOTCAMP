package lv.rcs.prebootcamp.lesson15.examples.encapsulation.p1;

public class Example2Program {

    public static void main(String[] args) {
        Example2 object = new Example2();
        System.out.println("prop1: " + object.prop1);

        //accessible because we are in the same package
        System.out.println("prop2: " + object.prop2);

        //not accessible because it is private
        //and available only inside clas
        //System.out.println("prop3: " + object.prop3);
    }
}
