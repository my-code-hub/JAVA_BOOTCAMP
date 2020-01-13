package lv.rcs.lesson18.examples._static;

public class StaticExample {

    static final String DEFAULT_VALUE = "defaultValue";

    public static void main(String[] args) {
        //constants
        A object1 = new A();
        object1.example2();

        A.example1();
        //doesn't work, because example2() isn't static
       // A.example2();

        System.out.println(object1.prop1);

        System.out.println(A.prop2);
        //doesn't work, because prop1 is instance variable
        //System.out.println(A.prop1);

        // object1.example1(); bad practice
        System.out.println(object1.prop2);

        // won't work
        // outputHello()
    }

    void outputHello() {
        System.out.println("HEllo!");
    }
}
