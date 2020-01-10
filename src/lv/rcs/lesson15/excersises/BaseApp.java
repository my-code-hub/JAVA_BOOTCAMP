package lv.rcs.lesson15.excersises;

import lv.rcs.lesson15.excersises.p1.A;
//import lv.rcs.lesson15.excersises.p1.B;

// 1. add import statement for class A
public class BaseApp {

    public static void main(String[] args) {
        // 2. create new instance of class A
        A object = new A();

        // 3. output the value of property "a" via the getter method
        //Note: if you did everything right, then the code below shouldn't be compiling:
//        A object = new A();
//        System.out.println(object.a);
        System.out.println(object.getA());


        //4. output the value of property c
        System.out.println(object.getC());

        //5. output property value "d"
        // update property "d" to value "BaseApp"
        // output property value "d"
        System.out.println(object.d);
        object.d = "BaseApp";
        System.out.println(object.d);

        //6. call method "famous()"
        object.famous();

        //7. try to create new instance of class B using default constructor.
        // Can you? Well, you shouldn't be able to, but do you understand why?
        //B object2 = new B(); because it's not public
    }
}
