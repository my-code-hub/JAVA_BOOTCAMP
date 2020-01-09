package lv.rcs.lesson15.examples.encapsulation;

import lv.rcs.lesson15.examples.encapsulation.p1.Example2;

public class Example1Program {

    public static void main(String[] args) {
        Example2 object = new Example2();
        // can't access object.prop1, because
        // it is accessible only inside package p1
        // (it has package access)
        // System.out.println(object.prop1);

        System.out.println(object.prop2);

        //prop3 is private
///        System.out.println(object.prop3);
        System.out.println(object.getProp3());

        // cann be used only from the same package
        //object.method1();

        object.method2();

        //is private
//        object.method3();
    }
}
